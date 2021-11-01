package br.com.rodrigoscorza.testebliss.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class EmojiEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val url: String,
)