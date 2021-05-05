package com.musabnasr.recyclerviewswipetodelete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val moviesList = mutableListOf(
        Movie("Raising Arizona", 1987),
        Movie("Vampire's Kiss", 1988),
        Movie("Con Air", 1997),
        Movie("Face/Off", 1997),
        Movie("National Treasure", 2004),
        Movie("The Wicker Man", 2006),
        Movie("Bad Lieutenant", 2009),
        Movie("Kick-Ass", 2010)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ListAdapter(moviesList)
        }


    }
}

