package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MotorPerformans : AppCompatActivity() {

    private lateinit var motorBilgisiButton: Button
    private lateinit var motorBilgisiButtonGeri: Button
    private lateinit var motorTipiBilgiEditText: EditText
    private lateinit var motorHacmiBilgiEditText: EditText
    private lateinit var azamiSüratBilgiEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motor_performans)
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        motorTipiBilgiEditText = findViewById(R.id.motorTipiBilgiEditText)
        motorHacmiBilgiEditText = findViewById(R.id.motorHacmiBilgiEditText)
        azamiSüratBilgiEditText = findViewById(R.id.azamiSüratBilgiEditText)
        motorBilgisiButton = findViewById(R.id.motorBilgisiButton)
        motorBilgisiButton.setOnClickListener {
            val intent = Intent(this, Yakit::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_in,R.anim.anim_out)
            finish()
        }
        motorBilgisiButtonGeri = findViewById(R.id.motorBilgisiButtonGeri)
        motorBilgisiButtonGeri.setOnClickListener {
            val intent = Intent(this, AracBilgileri::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_in_ters,R.anim.anim_out_ters)
            finish()
        }
    }
}