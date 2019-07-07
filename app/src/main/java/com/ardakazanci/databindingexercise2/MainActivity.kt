package com.ardakazanci.databindingexercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ardakazanci.databindingexercise2.bindingmodel.User
import com.ardakazanci.databindingexercise2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = User("Arda", 28)
        binding.handler = ClickHandler()


    }
}
