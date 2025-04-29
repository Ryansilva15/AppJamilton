package com.example.appjamilton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(v: View){
        var texto = findViewById<TextView>(R.id.text_sorteio)
        var numeroSorteado = Random(11)
        texto.setText("Número sorteado é: ${numeroSorteado}")

    }

}
