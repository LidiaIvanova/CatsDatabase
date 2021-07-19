package com.tsu.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNewCat()
    }

    private fun addNewCat() {
        val catDatabase = Room.databaseBuilder(
            applicationContext,
            CatDatabase::class.java, "database-cat"
        ).build()

        val newCat = Cat("Vasya","Siberian", 3)
        catDatabase.catDao().insert(newCat)
    }
}