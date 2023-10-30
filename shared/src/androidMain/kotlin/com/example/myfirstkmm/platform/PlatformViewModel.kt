package com.example.myfirstkmm.platform

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

actual typealias SharedViewModel = ViewModel
actual val SharedViewModel.scope: CoroutineScope
    get() = this.viewModelScope

actual open class SharedViewModel2 : ViewModel() {
    actual val scope = viewModelScope
}