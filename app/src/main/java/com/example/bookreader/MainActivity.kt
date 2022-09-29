package com.example.bookreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val books = Book.generateRandomBooks(100)
        val bookAdapter = BookAdapter(books)

        rv_books.layoutManager = LinearLayoutManager(this)
        rv_books.adapter = bookAdapter
    }
}