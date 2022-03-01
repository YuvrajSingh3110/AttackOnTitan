package com.example.aot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class blog_page : AppCompatActivity(), DoubtsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_page)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = blog_Adapter(items, this)
        recyclerView.adapter = adapter
    }
    private fun fetchData(): ArrayList<String>{
        val list = ArrayList<String>()
        for (i in 1 until 100){
            list.add("Blog $i")
        }
        return list
    }

    override fun onItemClicked(item: String) {

        Toast.makeText(this, "opening $item", Toast.LENGTH_LONG).show()

    }
}