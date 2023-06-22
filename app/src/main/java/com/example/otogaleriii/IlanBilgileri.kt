package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IlanBilgileri : AppCompatActivity() {

    private lateinit var ilanBilgiButton: Button
    private lateinit var ilanAciklamaEditText: EditText
    private lateinit var ilanBaslikEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilan_bilgileri)
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        ilanBilgiButton = findViewById(R.id.ilanBilgiButton)
        ilanAciklamaEditText = findViewById(R.id.ilanAciklamaEditText)
        ilanBaslikEditText = findViewById(R.id.ilanBaslikEditText)
        ilanBilgiButton.setOnClickListener {
            val intent = Intent(this, AdresBilgileri::class.java)
            startActivity(intent)
        }
    }
}