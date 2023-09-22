package com.example.launchmodes

import androidx.activity.ComponentActivity
import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore

class MyViewModel: ViewModel(){
    var value: LiveData<Int> = MutableLiveData<Int>(0)
}

val globalViewModelStore = ViewModelStore()

/**
 * Create a global ViewModel in the activity
 */
@MainThread
inline fun <reified VM : ViewModel> ComponentActivity.globalViewModels(
    noinline factoryProducer: (() -> ViewModelProvider.Factory)? = null
): Lazy<VM> {
    val factoryPromise = factoryProducer ?: {
        defaultViewModelProviderFactory
    }
    return ViewModelLazy(VM::class, { globalViewModelStore }, factoryPromise)
}