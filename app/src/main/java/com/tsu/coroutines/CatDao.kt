package com.tsu.coroutines

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CatDao {
    @Query("SELECT * FROM cat")
    fun getCats(): List<Cat>

    @Insert
    fun insert(cat: Cat)
}