package com.example.simplepattern.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Koin Start
        startKoin{
            androidContext(this@App)
            modules(modules)  // 사용할 Module 등록
        }

        // 복수개(여러개) 모듈 등록 시
        // modules(a_Module, b_Module, c_Module)
    }
}