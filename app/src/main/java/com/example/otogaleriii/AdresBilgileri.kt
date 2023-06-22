package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.otogaleriii.R
import android.widget.Button
import android.widget.EditText

class AdresBilgileri : AppCompatActivity() {

    private lateinit var adresBilgisiButton: Button
    private lateinit var sehirBilgiEditText: EditText
    private lateinit var ilceBilgiEditText: EditText
    private lateinit var mahalleBilgiEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adres_bilgileri)
        openIlanBilgileriSayfasi()
    }

    private fun openIlanBilgileriSayfasi() {
        sehirBilgiEditText = findViewById(R.id.sehirBilgiEditText)
        ilceBilgiEditText = findViewById(R.id.ilceBilgiEditText)
        mahalleBilgiEditText = findViewById(R.id.mahalleBilgiEditText)
        adresBilgisiButton = findViewById(R.id.adresBilgisiButton)
        adresBilgisiButton.setOnClickListener {
            val intent = Intent(this, AracBilgileri::class.java)
            startActivity(intent)
        }
    }
}