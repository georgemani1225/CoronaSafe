package com.geo.coronasafe

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

lateinit var cstats: CardView
lateinit var cfaq: CardView
lateinit var cvisualizer: CardView
lateinit var chelp: CardView
lateinit var cwhatsapp: CardView
lateinit var csymptom: CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cstats = findViewById(R.id.cStats)
        cfaq = findViewById(R.id.cFaq)
        cvisualizer = findViewById(R.id.cVisualizer)
        chelp = findViewById(R.id.cHelp)
        cwhatsapp = findViewById(R.id.cWhatsapp)
        csymptom = findViewById(R.id.cSymptom)
        cstats.setOnClickListener {
            val intent = Intent(this@MainActivity, Stats::class.java)
            startActivity(intent)
        }
        cvisualizer.setOnClickListener {
            val intent = Intent(this@MainActivity, Visualiser::class.java)
            startActivity(intent)
        }

        cfaq.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mohfw.gov.in/pdf/FAQ.pdf"))
            startActivity(intent)
        }
        chelp.setOnClickListener {
            val intent =
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.mohfw.gov.in/pdf/coronvavirushelplinenumber.pdf")
                )
            startActivity(intent)
        }
        cwhatsapp.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://api.whatsapp.com/send?phone=919013151515&text=Hi&source=&data=&app_absent=")
            )
            startActivity(intent)
        }
        csymptom.setOnClickListener {
            val intent = Intent(this@MainActivity, SymptomsActivity::class.java)
            startActivity(intent)
        }
        MobileAds.initialize(this,getString(R.string.admob_app_id))
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}

