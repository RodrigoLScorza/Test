package br.com.rodrigoscorza.testebliss.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.rodrigoscorza.testebliss.data.entity.EmojiEntity

@Dao
interface EmojiDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(emojiEntities: MutableList<EmojiEntity>)

    @Query("SELECT * FROM EmojiEntity WHERE id = :id")
    suspend fun getEmojiById(id: Long): LiveData<EmojiEntity>


    @Query("SELECT * FROM EmojiEntity")
    suspend fun getAllEmojis(id: Long): LiveData<MutableList<EmojiEntity>>


}