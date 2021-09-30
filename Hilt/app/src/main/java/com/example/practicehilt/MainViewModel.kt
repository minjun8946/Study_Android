package com.example.practicehilt

import android.annotation.SuppressLint
import com.example.domain.base.Result
import com.example.domain.entity.TeamBasicInfo
import com.example.domain.usecase.TeamUseCase
import com.example.practicehilt.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: TeamUseCase) : BaseViewModel() {
    @SuppressLint("CheckResult")
     fun team(){
        val disposableSingleObserver = object : DisposableSingleObserver<Result<TeamBasicInfo>>(){
            override fun onSuccess(t: Result<TeamBasicInfo>) {
                when(t){
                    is Result.Success -> println(t.data)
                    else -> println("radfasdfasdf")
                }
            }
            override fun onError(e: Throwable) {
                println("rkskekfkak")
            }
        }
        execute(Unit,disposableSingleObserver,useCase)

    }
}