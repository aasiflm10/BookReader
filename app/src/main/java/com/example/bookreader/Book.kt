package com.example.bookreader

import kotlin.random.Random

data class Book(
    val name: String,
    val year: String,
    val writer: String
) {
    companion object {
        private val books = arrayOf(
            "The Catcher in the Eye", "The Great Gatsby",
            "To Kill a Mockingbird", "The Sun Also Rises", "Jane Eyre"
        )

        private val writers =
            arrayOf("JD Sailing", "F. Scoot Fitz", "Harper Lee", "Ernest Hemingway", "Charlotte")

        private val years = arrayOf("2001", "2002", "2003", "2004", "2005", "2006")

        fun generateRandomBooks(n: Int): ArrayList<Book> {

            val toret = ArrayList<Book>()

            for (i in 0..n) {
                toret.add(
                    Book(
                        books[Random.nextInt(books.size)],
                        writers[Random.nextInt(writers.size)],
                        years[Random.nextInt(
                            years.size
                        )]
                    )
                )
            }
            return toret
        }
    }
}