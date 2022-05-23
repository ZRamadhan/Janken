package com.example.newapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    supportActionBar?.hide()

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
      val computer_move = (1..3).random()
      printLog("Pemain Gunting")
      if (computer_move == 1){
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        printLog("Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        printLog("Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        printLog("Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnPemainBatu.setOnClickListener{
      btnPemainBatu.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..3).random()
      printLog("Pemain Batu")
      if (computer_move == 1){
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        printLog("Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        printLog("Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        Log.d(MainActivity::class.java.simpleName, "Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnPemainKertas.setOnClickListener{
      btnPemainKertas.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..3).random()
      printLog("Pemain Kertas")
      if (computer_move == 1){
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        Log.d(MainActivity::class.java.simpleName, "Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2){
        Log.d(MainActivity::class.java.simpleName, "Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3){
        Log.d(MainActivity::class.java.simpleName, "Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnReset.setOnClickListener{
      btnPemainGunting.setBackgroundResource(0)
      btnPemainKertas.setBackgroundResource(0)
      btnPemainBatu.setBackgroundResource(0)
      btnComKertas.setBackgroundResource(0)
      btnComGunting.setBackgroundResource(0)
      btnComBatu.setBackgroundResource(0)

      txtMiddle.text = "VS"
      txtMiddle.setBackgroundResource(0)
    }
  }

  private fun printLog(text: String){
    Log.d(MainActivity::class.java.simpleName, text)
  }
}