package br.com.rodrigoscorza.testebliss.data.repository

import androidx.lifecycle.LiveData
import br.com.rodrigoscorza.testebliss.data.model.Emoji
import br.com.rodrigoscorza.testebliss.ui.list.EmojiViewModel

class EmojiDataSource(): EmojiRepository {
    override suspend fun saveEmojies(emojiViewModel: EmojiViewModel) {

    }

    override suspend fun getEmojiById(id: Long): LiveData<Emoji> {

    }

    override suspend fun getAllEmoji(): LiveData<MutableList<Emoji>> {

    }
}