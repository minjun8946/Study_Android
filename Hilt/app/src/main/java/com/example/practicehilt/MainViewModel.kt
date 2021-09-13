package com.example.practicehilt

import android.annotation.SuppressLint
import com.example.practicehilt.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiService: ApiService) : BaseViewModel() {
    @SuppressLint("CheckResult")
     fun team(){
        val api = apiService.getTeamList()
        api.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe { response ->
                println("${response.data} rkskek")
            }
    }
}