package com.example.tiptime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _amountInput = MutableLiveData("")
    val amountInput: LiveData<String> = _amountInput

    private val _tipInput = MutableLiveData("")
    val tipInput: LiveData<String> = _tipInput

    private val _roundUp = MutableLiveData(false)
    val roundUp: LiveData<Boolean> = _roundUp

    fun onAmountValueChange(input: String) {
        _amountInput.value = input
    }

    fun onTipValueChange(input: String) {
        _tipInput.value = input
    }

    fun onRoundUpChanged(it: Boolean) {
        _roundUp.value = it
    }


}