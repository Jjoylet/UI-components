package com.example.uicomponets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myImage : ImageView = findViewById(R.id.imgwater)
        val checkFootball : CheckBox = findViewById(R.id.checkBoxFootball)
        val checkRugby : CheckBox = findViewById(R.id .checkBoxRugby)
        val toggleJojo : ToggleButton = findViewById(R.id.toggleButtonJojo)
        val switchDisplayMode : Switch = findViewById(R.id.switchLightMode)
        val groupGender : RadioGroup = findViewById(R.id.groupGender)

        var original = true
        myImage.setOnClickListener{
            if (original) {
                myImage.setImageResource(R.drawable.coffe)
                original=false
            }else{
                myImage.setImageResource(R.drawable.bottle)
                original=true
            }
        }

        checkFootball.setOnCheckedChangeListener{ checkbox, ischecked ->
            if (ischecked)
            {
                Toast.makeText(this, "Football checked", Toast.LENGTH_SHORT).show()
            }else
            {
                Toast.makeText(this, "Football Not Selected", Toast.LENGTH_SHORT).show()
            }
        }
        toggleJojo.setOnCheckedChangeListener{ toggleBtn, isTurnedOn ->
            if (isTurnedOn){
                Toast.makeText(this, "Wifi is on", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Wifi is off",Toast.LENGTH_SHORT).show()
            }
        }

        //switchDisplayMode.setOnCheckedChangeListener()
        groupGender.setOnCheckedChangeListener{_, id ->
            if (id == R.id.radiofemale){
                Toast.makeText(this, "Iam a female",Toast.LENGTH_SHORT).show()
            }else if (id == R.id.radiomale){
                Toast.makeText(this, "Iam Male",Toast.LENGTH_SHORT).show()
            }else if (id == R.id.radioOther){
                Toast.makeText(this,"Iam not sure about my gender",Toast.LENGTH_SHORT).show()
            }
        }

    }
}