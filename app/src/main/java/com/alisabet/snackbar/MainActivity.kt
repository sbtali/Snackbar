package com.alisabet.snackbar

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //1.add coordinate layout
    //2.code like below :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val coordinate = findViewById<CoordinatorLayout>(R.id.cl)
        val snackbar = Snackbar.make(coordinate, "hello", Snackbar.LENGTH_LONG)
        snackbar.setActionTextColor(Color.YELLOW)
        snackbar.setAction("retry", View.OnClickListener {
            Toast.makeText(this, "toast", Toast.LENGTH_LONG).show()
        })
        button.setOnClickListener {
            snackbar.show()
        }

    }
}
