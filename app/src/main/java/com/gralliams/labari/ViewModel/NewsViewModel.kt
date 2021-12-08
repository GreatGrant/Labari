package com.gralliams.labari.ViewModel

import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gralliams.labari.LabariApplication
import com.gralliams.labari.Repository.NewsRepository
import com.gralliams.labari.models.NewsResponse
import com.gralliams.labari.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class NewsViewModel(
    private val newsRepository: NewsRepository,
    app: Application
): AndroidViewModel(app){

    //Holds breaking news response
    val breakingNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    private val breakingNewsPage = 1

    init {
        getBreakingNews("ng")
    }

    //viewModelScope.launch ensures Coroutine only stays alive as long as ViewModel
    private fun getBreakingNews(countryCode: String) = viewModelScope.launch {
        safeBreakingNewsCall(countryCode)

    }

    private fun handleBreakingNewsResponse(response: Response <NewsResponse>) : Resource<NewsResponse>{
        if (response.isSuccessful){
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
    }
    return Resource.Error(response.message())
    }

    private suspend fun safeBreakingNewsCall(countryCode: String){
        breakingNews.postValue(Resource.Loading())

        try {
            if (hasNetworkConnection()) {
                val response = newsRepository.getBreakingNews(countryCode, breakingNewsPage)
                breakingNews.postValue(handleBreakingNewsResponse(response))
            }else{
                breakingNews.postValue(Resource.Error("No internet connection"))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> breakingNews.postValue(Resource.Error("Network failure"))
                else -> breakingNews.postValue(Resource.Error("Conversion Error"))
            }
        }
    }


//    private suspend fun safeSearchNewsCall(searchQuery: String){
//        breakingNews.postValue(Resource.Loading())
//
//        try {
//            if (hasNetworkConnection()) {
//                val response = newsRepository.getBreakingNews(searchQuery, breakingNewsPage)
//                breakingNews.postValue(handleBreakingNewsResponse(response))
//            }else{
//                breakingNews.postValue(Resource.Error("No internet connection"))
//            }
//        }catch (t: Throwable){
//            when(t){
//                is IOException -> breakingNews.postValue(Resource.Error("Network failure"))
//                else -> breakingNews.postValue(Resource.Error("Conversion Error"))
//            }
//        }
//    }

    private fun hasNetworkConnection(): Boolean{
        val connectivityManager = getApplication<LabariApplication>().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val activeNetwork = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false

            //  Check wifi connection

            return when{
                 capabilities.hasTransport(TRANSPORT_WIFI) -> true
                 capabilities.hasTransport(TRANSPORT_CELLULAR) -> true
                 capabilities.hasTransport(TRANSPORT_ETHERNET) -> true
                 else -> false
            }
        } else {
            connectivityManager.activeNetworkInfo?.run {
                return when(type){
                    TYPE_WIFI -> true
                    TYPE_MOBILE -> true
                    TYPE_ETHERNET -> true
                    else -> false
                }
            }
        return false
        }

    }
}