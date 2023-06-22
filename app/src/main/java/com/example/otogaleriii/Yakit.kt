package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Yakit : AppCompatActivity() {

    private lateinit var yakitTüketimBilgisiButton: Button
    private lateinit var yakitTipiBilgiEditText: EditText
    private lateinit var ortalamaYakitBilgiEditText: EditText
    private lateinit var depoHacmiBilgiEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yakit)
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        yakitTipiBilgiEditText = findViewById(R.id.yakitTipiBilgiEditText)
        ortalamaYakitBilgiEditText = findViewById(R.id.ortalamaYakitBilgiEditText)
        depoHacmiBilgiEditText = findViewById(R.id.depoHacmiBilgiEditText)
        yakitTüketimBilgisiButton = findViewById(R.id.yakitTüketimBilgisiButton)
        yakitTüketimBilgisiButton.setOnClickListener {
            val intent = Intent(this, IlanResimler::class.java)
            startActivity(intent)
        }
    }
}