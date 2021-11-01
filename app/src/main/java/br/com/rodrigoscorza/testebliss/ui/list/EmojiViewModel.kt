package br.com.rodrigoscorza.testebliss.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.rodrigoscorza.testebliss.data.model.Emoji
import br.com.rodrigoscorza.testebliss.data.repository.EmojiRepository

class EmojiViewModel(val repository: EmojiRepository) : ViewModel() {


    private val emojiesLiveData: LiveData<MutableList<Emoji>>
        get() = dbEmojiesMediatorLiveData
    val dbEmojiesMediatorLiveData = MediatorLiveData<MutableList<Emoji>>()


    fun getEmojies() {

    }


    class EmojiViewModelFactory(private val repository: EmojiRepository) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return EmojiViewModel(repository = repository) as T
        }
    }

}