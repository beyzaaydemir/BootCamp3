package com.beyzanuraydemir.bootcamp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.beyzanuraydemir.bootcamp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        binding.startbutton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent:Intent = Intent(this,StartActivity::class.java)
        startActivity(intent)
    }
}