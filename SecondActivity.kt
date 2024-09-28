package com.hakanpolat.yasamdongusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakanpolat.yasamdongusu.databinding.ActivityMainBinding
import com.hakanpolat.yasamdongusu.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    fun  birinciAktiviteyiAc(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }



}