package com.beyzanuraydemir.bootcamp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.beyzanuraydemir.bootcamp3.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPremiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_premium)
        //setContentView(R.layout.activity_premium)

        binding.button3.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
       val intent:Intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}