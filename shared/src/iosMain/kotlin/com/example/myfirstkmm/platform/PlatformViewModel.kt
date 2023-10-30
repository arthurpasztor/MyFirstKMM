package com.example.myfirstkmm.platform

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

actual abstract class SharedViewModel
actual val SharedViewModel.scope: CoroutineScope
    get() = MainScope()

actual open class SharedViewModel2 {
    actual val scope: CoroutineScope
        get() = MainScope()
}