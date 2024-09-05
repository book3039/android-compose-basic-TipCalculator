package com.example.tiptime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _amountInput = MutableLiveData("")
    val amountInput: LiveData<String> = _amountInput

    fun onValueChange(input: String) {
        _amountInput.value = input
    }
}