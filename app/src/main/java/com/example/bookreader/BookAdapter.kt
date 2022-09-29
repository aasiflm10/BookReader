package com.example.bookreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.book_row.view.*

class BookAdapter(
    private val books: ArrayList<Book>
): RecyclerView.Adapter<BookAdapter.BookViewHolder>(){

    class BookViewHolder( itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.book_row, parent, false
        )

        return BookViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.itemView.book_name1.text = books[position].name
        holder.itemView.book_name2.text = books[position].writer
    }

    override fun getItemCount(): Int {
        return books.size
    }
}