package com.hakanpolat.hakanpolatodevim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import com.hakanpolat.hakanpolatodevim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun sonucuGoster(view: View) {
        try {
            val kullaniciGirdisi = binding.editText.text.toString().toIntOrNull()
            val kullaniciGirdisi1 = binding.editText2.text.toString().toIntOrNull()

            var sonuc = 0.0
            var sonuc1 = 0.0

            if (kullaniciGirdisi != null) {
                sonuc = kullaniciGirdisi * 0.4
            } else {
                Log.e("MainActivity", "Birinci kullanıcı girişi null")
            }

            if (kullaniciGirdisi1 != null) {
                sonuc1 = kullaniciGirdisi1 * 0.6
            } else {
                Log.e("MainActivity", "İkinci kullanıcı girişi null")
            }

            val toplamSonuc = sonuc + sonuc1
            binding.textView.text = "Sonuç: ${toplamSonuc}"

        } catch (e: Exception) {
            Log.e("MainActivity", "Hata: ${e.message}", e)
        }
    }
}