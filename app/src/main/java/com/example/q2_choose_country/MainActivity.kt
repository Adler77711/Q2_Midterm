package com.example.q2_choose_country

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btConfirm)
        var country: String = "Canada"
        val resultTV: TextView = findViewById(R.id.tvResult)
        val spinnerCountry : Spinner = findViewById(R.id.spCountry)
        var options = arrayOf("Canada","America","China","India")
        spinnerCountry.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        button.setOnClickListener{ view ->
//code here
            when(country){
                "Canada" -> { resultTV.text = "Welcome to Canada!"
                    }
                "America" -> {resultTV.text = "Welcome to America"
                    }
                "China" -> {resultTV.text = "Welcome to China"
                    }
                "India" -> {resultTV.text = "Welcome to India"
                    }
            }
        }
        spinnerCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long
            ) {
                country = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}