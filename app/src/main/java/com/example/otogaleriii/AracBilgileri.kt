package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AracBilgileri : AppCompatActivity() {

    private lateinit var aracBilgisiButton: Button
    private lateinit var markaBilgiEditText: EditText
    private lateinit var seriBilgiEditText: EditText
    private lateinit var modelBilgiEditText: EditText
    private lateinit var yilBilgiEditText: EditText
    private lateinit var kmBilgiEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arac_bilgileri)
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        markaBilgiEditText = findViewById(R.id.markaBilgiEditText)
        seriBilgiEditText = findViewById(R.id.seriBilgiEditText)
        modelBilgiEditText = findViewById(R.id.modelBilgiEditText)
        yilBilgiEditText = findViewById(R.id.yilBilgiEditText)
        kmBilgiEditText = findViewById(R.id.kmBilgiEditText)
        aracBilgisiButton = findViewById(R.id.aracBilgisiButton)
        aracBilgisiButton.setOnClickListener {
            val intent = Intent(this, MotorPerformans::class.java)
            startActivity(intent)
        }
}
}