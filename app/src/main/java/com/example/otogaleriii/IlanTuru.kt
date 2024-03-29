package com.example.otogaleriii
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.example.otogaleriii.data.model.IlanVerPojo
import kotlinx.coroutines.newFixedThreadPoolContext

class IlanTuru : AppCompatActivity() {

    private lateinit var ilanTuruButon: Button
    private lateinit var ilanTuruButonGeri: Button
    private lateinit var ilanturuSpinner: Spinner
    private lateinit var kimdenSpinner: Spinner
    private lateinit var turList: ArrayList<String>
    private lateinit var sahipList: ArrayList<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilan_turu)
        listeDoldur()
        openIlanBilgileriSayfasi()
    }
    private fun openIlanBilgileriSayfasi() {
        ilanturuSpinner = findViewById(R.id.ilanturuSpinner)
        kimdenSpinner = findViewById(R.id.kimdenSpinner)

        val turListAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, turList)
        turListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        ilanturuSpinner.adapter = turListAdapter

        val sahipListAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sahipList)
        sahipListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        kimdenSpinner.adapter = sahipListAdapter

        ilanTuruButon = findViewById(R.id.ilanTuruButon)
        ilanTuruButon.setOnClickListener {
            IlanVerPojo.setKimden(kimdenSpinner.getSelectedItem().toString())
            IlanVerPojo.setIlantipi(ilanturuSpinner.getSelectedItem().toString())
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
    fun listeDoldur() {
        turList = ArrayList<String>()
        sahipList = ArrayList<String>()
        turList.add("Satılık")
        turList.add("Kiralık")
        sahipList.add("Sahibinden")
        sahipList.add("Galeriden")
    }

}