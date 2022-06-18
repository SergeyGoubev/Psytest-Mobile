package com.golubev.mobilecursach

import android.content.Intent
import com.golubev.mobilecursach.R.layout.activity_description_type
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.activity_description_type.*
import kotlinx.android.synthetic.main.activity_question.*


class DescriptoinType : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_description_type)

        val demonstrativ = getString(R.string.demonstrative)
        val stuc = getString(R.string.stuck)
        val pedanti = getString(R.string.pedantic)
        val excitabl = getString(R.string.excitable)
        val hyperthymi = getString(R.string.hyperthymic)
        val disthymi = getString(R.string.disthymic)
        val anxiouslyFearFul = getString(R.string.anxiouslyFearFull)
        val emotionall = getString(R.string.emotionally)
        val emotiv = getString(R.string.emotive)
        val cyclothymi = getString(R.string.cyclothymic)
        val demonstrativTyp = getString(R.string.demonstrativeType)
        val stucTyp = getString(R.string.stuckType)
        val pedantiTyp = getString(R.string.pedanticType)
        val excitablTyp = getString(R.string.excitableType)
        val hyperthymiTyp = getString(R.string.hyperthymicType)
        val disthymiTyp = getString(R.string.disthymicType)
        val anxiouslyFearFulTyp = getString(R.string.anxiouslyFearFullType)
        val emotionallTyp = getString(R.string.emotionallyType)
        val emotivTyp = getString(R.string.emotiveType)
        val cyclothymiTyp = getString(R.string.cyclothymicType)

        //val textView2 = findViewById<TextView>(R.id.textview2)
        //textView2.setOnClickListener { v: View? -> textView2.maxLines = Int.MAX_VALUE }

        demonstrative.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", demonstrativ)
            intent.putExtra("Top", demonstrativTyp)
            startActivity(intent)

        }

        stuck.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", stuc)
            intent.putExtra("Top", stucTyp)
            startActivity(intent)

        }

        pedantic.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", pedanti)
            intent.putExtra("Top", pedantiTyp)
            startActivity(intent)

        }

        excitable.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", excitabl)
            intent.putExtra("Top", excitablTyp)
            startActivity(intent)

        }

        hyperthymic.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", hyperthymi)
            intent.putExtra("Top", hyperthymiTyp)
            startActivity(intent)

        }

        disthymic.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", disthymi)
            intent.putExtra("Top", disthymiTyp)
            startActivity(intent)

        }

        anxiouslyFearFull.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", anxiouslyFearFul)
            intent.putExtra("Top", anxiouslyFearFulTyp)
            startActivity(intent)

        }

        emotionally.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", emotionall)
            intent.putExtra("Top", emotionallTyp)
            startActivity(intent)

        }

        emotive.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", emotiv)
            intent.putExtra("Top", emotivTyp)
            startActivity(intent)

        }

        cyclothymic.setOnClickListener {
            val intent = Intent(this, TypeDescriptionExpend::class.java)
            intent.putExtra("TypeDesc", cyclothymi)
            intent.putExtra("Top", cyclothymiTyp)
            startActivity(intent)

        }
    }
}