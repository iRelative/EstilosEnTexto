package com.example.ejercicio4

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edCadena : EditText
    lateinit var checkNegrita : CheckBox
    lateinit var checkCursiva : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edCadena = findViewById(R.id.edCadena)
        checkNegrita = findViewById(R.id.checkNegrita)
        checkCursiva = findViewById(R.id.checkCursiva)
    }
    fun verificaCheck(view: View){
        if (checkCursiva.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else if(checkNegrita.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }else{
            edCadena.typeface = Typeface.DEFAULT
        }
        if(checkNegrita.isChecked && checkCursiva.isChecked){
            edCadena.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }
    }
}