package com.bigrocket.recyclerviewkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var profileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter()
        populateItems()
    }

    private fun populateItems() {
        val dataSource = DataSource.createDataSet()
        profileAdapter.setDataSet(dataSource)
    }

    private fun initAdapter() {
        profileAdapter = ProfileAdapter { profile ->
            openGithub()
        }

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = profileAdapter
    }

    private fun openGithub() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/kaueludovico"))
        startActivity(intent)
    }
}