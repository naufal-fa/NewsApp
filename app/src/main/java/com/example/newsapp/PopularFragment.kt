package com.example.newsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.DataNews

class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular, container, false)
        val rvPopularNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvPopularNews.layoutManager = LinearLayoutManager(view.context)
        rvPopularNews.adapter = NewsAdapter(DataNews.dataPopularNews)
        return view
    }
}