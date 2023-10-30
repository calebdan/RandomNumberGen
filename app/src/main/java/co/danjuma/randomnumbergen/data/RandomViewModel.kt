package co.danjuma.randomnumbergen.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random


class RandomViewModel : ViewModel() {
    private val _randomNumber = mutableStateOf(0)


    fun generateRandomNumber() {
        _randomNumber.value = Random.nextInt(0, 100)
    }

    val randomNumber
        get() = _randomNumber


}
