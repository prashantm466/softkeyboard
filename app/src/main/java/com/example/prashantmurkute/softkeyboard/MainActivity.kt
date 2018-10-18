package com.example.prashantmurkute.softkeyboard

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.prashantmurkute.softkeyboard.R.id.bottomContainer
import kotlinx.android.synthetic.main.activity_main.*
import com.example.prashantmurkute.softkeyboard.R.id.bottomContainer
import android.content.Context.INPUT_METHOD_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.view.inputmethod.InputMethodManager


class MainActivity : Base() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*val btnShow = findViewById<Button>(R.id.button2)
            btnShow?.setOnClickListener {
                Toast.makeText(this@MainActivity, R.string.welcome_message, Toast.LENGTH_LONG).show()
            }*/
        setContentView(R.layout.activity_main)
        attachKeyboardListeners()
    }

    override fun onShowKeyboard(keyboardHeight: Int) {
        Toast.makeText(this@MainActivity, R.string.Show, Toast.LENGTH_SHORT).show()
        bottomContainer.visibility = View.GONE
    }

    override fun onHideKeyboard(){
        Toast.makeText(this@MainActivity, R.string.hide, Toast.LENGTH_SHORT).show()
        bottomContainer.visibility = View.VISIBLE
    }
}
