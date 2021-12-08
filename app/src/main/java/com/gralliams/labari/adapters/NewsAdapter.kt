package com.gralliams.labari.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gralliams.labari.databinding.ArticleItemBinding
import com.gralliams.labari.models.Article

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
     NewsHolder(ArticleItemBinding.inflate(
         LayoutInflater.from(parent.context),
         parent,
         false
     ))

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {

        var article = differ.currentList[position]
        holder.itemBinding.apply {
            Glide.with(holder.itemView).load(article.urlToImage).into(articleImg)
            articleTitle.text = article.title
            articleDescription.text = article.description
            source.text = article.source.name
            setOnItemClickListener {
                onItemClickListener?.let { it(article) }
            }
        }


    }

    private var onItemClickListener : ((Article) -> Unit) ? = null
    fun setOnItemClickListener(listener: (Article)-> Unit){
        onItemClickListener = listener
    }

    override fun getItemCount() = differ.currentList.size

    private val differCallBack = object : DiffUtil.ItemCallback<Article>(){

        override fun areItemsTheSame(oldItem: Article, newItem: Article) = oldItem.url == newItem.url

        override fun areContentsTheSame(oldItem: Article, newItem: Article) = oldItem == newItem
    }

    var differ = AsyncListDiffer(this, differCallBack)

    inner class NewsHolder(var itemBinding: ArticleItemBinding): RecyclerView.ViewHolder(itemBinding.root) {

    }

}