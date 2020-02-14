package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        // Get the string array
        val countries = resources.getStringArray(R.array.countries_array)
        // Create the adapter and set it to the AutoCompleteTextView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        textView.setAdapter(adapter)

        val button = findViewById<Button>(R.id.button)
        if (button != null) {
            button.setOnClickListener(View.OnClickListener {


               textView.showDropDown();



               // val text = getString(R.string.entered_text) + " " + textView.getText()
               // Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
            })
        }
    }
}
