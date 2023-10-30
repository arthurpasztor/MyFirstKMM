package com.example.myfirstkmm.platform

import kotlinx.coroutines.CoroutineScope

expect abstract class SharedViewModel()
expect val SharedViewModel.scope: CoroutineScope

expect open class SharedViewModel2() {
    val scope: CoroutineScope
}