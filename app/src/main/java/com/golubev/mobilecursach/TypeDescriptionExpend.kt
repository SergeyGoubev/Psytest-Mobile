package com.golubev.mobilecursach

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_description.*

class TypeDescriptionExpend : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_description)

            TypeDesc.text = intent.getStringExtra("TypeDesc")
            Top.text = intent.getStringExtra("Top")

            BackDescType.setOnClickListener {
                val intent = Intent(this, DescriptoinType::class.java)
                startActivity(intent)
            }
        }
}