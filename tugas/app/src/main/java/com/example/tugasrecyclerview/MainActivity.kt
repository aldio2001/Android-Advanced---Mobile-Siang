package com.example.tugasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            ),
            Superhero(
                R.drawable.a,
                nameSuperhero = "Aldio",
                descSuperhero = "Mahasiswa Pengembang Aplikasi Mobile di Infinite Learning"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {
            // Tindakan saat item diklik, jika diperlukan
        }
    }
}

