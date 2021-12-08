package com.gralliams.labari.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.gralliams.labari.NewsActivity
import com.gralliams.labari.R
import com.gralliams.labari.ViewModel.NewsViewModel
import com.gralliams.labari.adapters.NewsAdapter
import com.gralliams.labari.databinding.FragmentBreakingNewsBinding
import com.gralliams.labari.models.Article
import com.gralliams.labari.util.Resource
import com.gralliams.labari.util.TAG

class BreakingNewsFragment : Fragment(){
lateinit var viewModel: NewsViewModel
lateinit var newsAdapter: NewsAdapter
    private var _binding: FragmentBreakingNewsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBreakingNewsBinding.inflate(inflater, container, false)
        val root = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding = FragmentBreakingNewsBinding.inflate(layoutInflater)
        viewModel = (activity as NewsActivity).viewModel
        setUpRecyclerView()

        viewModel.breakingNews.observe(viewLifecycleOwner, Observer { response ->

            when(response){
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let {
                        newsAdapter.differ.submitList(it.articles) }
                }
                is Resource.Error -> {
                    response.message?.let { message ->
                        Log.e(TAG, "An error occurred $message")
                }

                }
                is Resource.Loading ->{
                    showProgressBar()
                }
            }

        } )
    }

    private fun showProgressBar() {
        _binding?.progressBar?.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        _binding?.progressBar?.visibility = View.INVISIBLE
    }

    private fun setUpRecyclerView(){
        newsAdapter = NewsAdapter()
        binding.newsRv.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}