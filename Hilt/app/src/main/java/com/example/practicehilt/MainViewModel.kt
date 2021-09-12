package com.example.practicehilt

import androidx.hilt.lifecycle.ViewModelInject
import com.example.practicehilt.base.BaseViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject


class MainViewModel constructor() : BaseViewModel() {
    fun a() = println("가나다라")
}