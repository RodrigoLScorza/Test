package br.com.rodrigoscorza.testebliss.data.repository

import androidx.lifecycle.LiveData
import br.com.rodrigoscorza.testebliss.data.model.Emoji
import br.com.rodrigoscorza.testebliss.ui.list.EmojiViewModel

interface EmojiRepository {
    suspend fun saveEmojies(emojiViewModel: EmojiViewModel)

    suspend fun getEmojiById(id: Long): LiveData<Emoji>

    suspend fun getAllEmoji(): LiveData<MutableList<Emoji>>


}