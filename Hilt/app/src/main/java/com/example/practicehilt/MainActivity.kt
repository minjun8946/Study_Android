package com.example.practicehilt

import androidx.activity.viewModels
import com.example.practicehilt.base.BaseActivity
import com.example.practicehilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>() {
    @Inject
    lateinit var a : String
    override val layoutId = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()

    override fun init() {
        viewModel.team()
    }


}