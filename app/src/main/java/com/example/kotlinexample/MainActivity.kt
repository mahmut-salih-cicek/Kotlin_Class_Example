package com.example.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun Basmak(view:View){
        var isimText = isim.text.toString()
        var yastext: Int? = yas.text.toString().toIntOrNull()
        var meslekText = meslek.text.toString()
        if (yastext == null){
       
        }else{
            var kullanıcıKayıt = SuperKahraman(isimText,yastext!!,meslekText)
            TextView.text = "Meslek: ${kullanıcıKayıt.meslek} \n Yaş: ${kullanıcıKayıt.yas} \n İsim: ${kullanıcıKayıt.isim}"
        }



    }


}