package com.gralliams.labari.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.gralliams.labari.NewsActivity
import com.gralliams.labari.R
import com.gralliams.labari.ViewModel.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article){
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}