package com.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.databinding.databinding.ActivityMainBinding
import com.databinding.databinding.SecondMainBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.second_main)
        binding.userData=getUserData()

    }

   private fun getUserData():UserData{
       return UserData(1,"Dayanand Patil","dayanand@gmail.com")

   }
}