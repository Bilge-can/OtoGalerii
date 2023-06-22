package com.example.otogaleriii
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class IlanTuru : AppCompatActivity() {

    private lateinit var ilanTuruButon: Button
    private lateinit var ilanTuruButonGeri: Button
    private lateinit var ilanturuSpinner: Spinner
    private lateinit var kimdenSpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilan_turu)
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        ilanturuSpinner = findViewById(R.id.ilanturuSpinner)
        kimdenSpinner = findViewById(R.id.kimdenSpinner)
        ilanTuruButon = findViewById(R.id.ilanTuruButon)
        ilanTuruButon.setOnClickListener {
            val intent = Intent(this, AdresBilgileri::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_in,R.anim.anim_out)
            finish()
        }
        ilanTuruButonGeri = findViewById(R.id.ilanTuruButonGeri)
        ilanTuruButonGeri.setOnClickListener {
            val intent = Intent(this, IlanBilgileri::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_in_ters,R.anim.anim_out_ters)
            finish()
        }
    }
}