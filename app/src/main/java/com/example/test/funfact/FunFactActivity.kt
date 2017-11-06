package com.example.test.funfact

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FunFactActivity : AppCompatActivity() {

    // Declare our View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_fact)

        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        showFactButton!!.setOnClickListener {
            // The button was clicked , so update the fact TextView a new fact
            val fact = "ostriches can run faster than horses."
            factTextView!!.text = fact
        }
    }
}
