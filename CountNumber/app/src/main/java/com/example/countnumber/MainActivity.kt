package com.example.countnumber

import android.content.Context;
import android.support.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


class MainActivity : AppCompatActivity() {
    var counter = 0
    var tambah: Button? = null
    var kurang: Button? = null
    var reset: Button? = null
    var nilai: TextView? = null
    var context: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        tambah = findViewById<View>(R.id.btnTambah) as Button
        kurang = findViewById<View>(R.id.btnKurang) as Button
        reset = findViewById<View>(R.id.btnReset) as Button
        nilai = findViewById<View>(R.id.txtNilai) as TextView
        nilai!!.text = "" + counter
        tambah!!.setOnClickListener {
            counter++
            nilai!!.text = "" + counter
        }
        kurang!!.setOnClickListener {
            counter--
            nilai!!.text = "" + counter
        }
        reset!!.setOnClickListener {
            counter = 0
            nilai!!.text = "" + counter
        }
    }
}