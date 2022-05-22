package com.example.newapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val btnPemainGunting = findViewById<ImageView>(R.id.pemainSatu)
    val btnPemainBatu = findViewById<ImageView>(R.id.pemainDua)
    val btnPemainKertas = findViewById<ImageView>(R.id.pemainTiga)

    val btnComKertas = findViewById<ImageView>(R.id.comSatu)
    val btnComGunting = findViewById<ImageView>(R.id.comDua)
    val btnComBatu = findViewById<ImageView>(R.id.comTiga)

    val btnReset = findViewById<ImageView>(R.id.btnReset)
    val txtMiddle = findViewById<TextView>(R.id.textVersus)

    btnPemainGunting.setOnClickListener{
      btnPemainGunting.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..4).random()
      if (computer_move == 1){
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnPemainBatu.setOnClickListener{
      btnPemainBatu.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..4).random()
      if (computer_move == 1){
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnPemainKertas.setOnClickListener{
      btnPemainKertas.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..4).random()
      if (computer_move == 1){
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnReset.setOnClickListener{
      btnPemainGunting.setBackgroundColor(Color.rgb(255, 255, 255))
      btnPemainKertas.setBackgroundColor(Color.rgb(255, 255, 255))
      btnPemainBatu.setBackgroundColor(Color.rgb(255, 255, 255))
      btnComKertas.setBackgroundColor(Color.rgb(255, 255, 255))
      btnComGunting.setBackgroundColor(Color.rgb(255, 255, 255))
      btnComBatu.setBackgroundColor(Color.rgb(255, 255, 255))
      txtMiddle.text = "VS"
      txtMiddle.setTextColor(Color.rgb(255, 0, 0))
      txtMiddle.setBackgroundColor(Color.rgb(255, 255, 255))
    }
  }
}