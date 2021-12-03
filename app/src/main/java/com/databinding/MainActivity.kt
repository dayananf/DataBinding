package com.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSubmit.setOnClickListener {
            displayText()
        }
        binding.btnProgress.setOnClickListener {
            startOrStopProgressBar()
        }
    }

    private fun startOrStopProgressBar() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                btnProgress.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                btnProgress.text = "Start"
            }
        }

    }

    private fun displayText() {
        // Apply Common Data Binding
        binding.apply {
            txtOutPut.text = "Hello " + edtName.text
        }

        //  binding.txtOutPut.text = "Hello " + binding.edtName.text

    }
}