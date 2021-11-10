package com.example.newsapp.data

data class News(
    val title: String,
    val content: String,
    val date: String,
    val author: String,
    val time: String,
    val photo: Int,
    val category: String
)

// Contoh penggunaan data class
// val data = arrayOf(News("IDN", "Sekolah"), News("Jakarta", "Kota"), News("Bogor", "Jawabarat"))