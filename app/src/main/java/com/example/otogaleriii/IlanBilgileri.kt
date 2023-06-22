package com.example.otogaleriii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.otogaleriii.data.model.IlanVerPojo

class IlanBilgileri : AppCompatActivity() {

    private lateinit var ilanBilgiButton: Button
    private lateinit var ilanBilgiButtonGeri: Button
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
        ilanAciklamaEditText.setText(IlanVerPojo.getAciklama())
        ilanBaslikEditText.setText(IlanVerPojo.getBaslik())
        ilanBilgiButton.setOnClickListener {
            if (ilanAciklamaEditText.getText().toString() != null && ilanBaslikEditText.getText().toString() != null) {
                IlanVerPojo.setAciklama(ilanAciklamaEditText.getText().toString())
                IlanVerPojo.setBaslik(ilanBaslikEditText.getText().toString())
                val intent = Intent(this, IlanTuru::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out)
                finish()
            } else{
                Toast.makeText(getApplicationContext(),"Lütfen tüm bilgileri giriniz!",Toast.LENGTH_LONG).show()
            }

        }
        ilanBilgiButtonGeri = findViewById(R.id.ilanBilgiButtonGeri)
        ilanBilgiButtonGeri.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_in_ters,R.anim.anim_out_ters)
            finish()
        }
    }
}