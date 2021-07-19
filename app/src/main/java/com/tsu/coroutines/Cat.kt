package com.tsu.coroutines

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cat(
    val name: String,
    val breed: String?,
    val age: Int,
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
)