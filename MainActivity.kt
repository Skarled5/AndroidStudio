package com.hakanpolat.yasamdongusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hakanpolat.yasamdongusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) { // kullanıcı daha görmüyor
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun sonrakiSayfa(view : View){
        // context
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
        //var kullaniciGirdisi = binding.editText.text.toString()
        //binding.textView.text = "İsim: ${kullaniciGirdisi}"
        var kullaniciGirdisi = binding.editText.text.toString()
        intent.putExtra("isim",kullaniciGirdisi)
        startActivity(intent)

    }
}