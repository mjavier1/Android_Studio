package com.example.fristkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.util.Log;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Comentario
        /*
        Bloque mas info
         */

        //logs demostra resultados
        Log.d("Hello","mj")
// var variable aplicacion
        //val constante
        //numerico

var numeroentero:Int=10
        var numeroEnteroGrande:Long = 255555555555522L
        var numerShort:Short = 30
        var numberByte:Byte=8
        var numeroFloante:Float=87.5F
        var numerDouble:Double=3.14

        //Bool
        var T:Boolean=true
        var F:Boolean=false

        //textos
        var caracter:Char='c'
        var texto:String="Esto es un texto"

    }
}
