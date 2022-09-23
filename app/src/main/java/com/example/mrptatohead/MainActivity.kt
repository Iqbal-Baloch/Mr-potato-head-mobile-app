package com.example.mrptatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clickedHat(view: View){
        val img:ImageView = findViewById(R.id.imgHat)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedEyes(view: View){
        val img:ImageView = findViewById(R.id.imgEyes)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedEyebrows(view: View){
        val img:ImageView = findViewById(R.id.imgEyebrows)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedGlasses(view: View){
        val img:ImageView = findViewById(R.id.imgGlasses)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedEars(view: View){
        val img:ImageView = findViewById(R.id.imgEar)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedArms(view: View){
        val img:ImageView = findViewById(R.id.imgArms)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedMouth(view: View){
        val img:ImageView = findViewById(R.id.imagMouth)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedMushtache(view: View){
        val img:ImageView = findViewById(R.id.imgMushachte)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedNose(view: View){
        val img:ImageView = findViewById(R.id.imagNose)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
    fun clickedShoes(view: View){
        val img:ImageView = findViewById(R.id.imgShoes)
        if(findViewById<CheckBox>(view.id).isChecked)
            img.visibility = View.VISIBLE
        else
            img.visibility = View.INVISIBLE
    }
}
