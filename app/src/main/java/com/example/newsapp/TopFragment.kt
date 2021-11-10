package com.example.newsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.DataNews

class TopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_top, container, false)
        val rvTopNews = view.findViewById<RecyclerView>(R.id.rv_top_news)
        rvTopNews.layoutManager = LinearLayoutManager(view.context)
        rvTopNews.adapter = NewsAdapter(DataNews.dataTopNews)
        return view
    }
}