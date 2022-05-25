package com.example.newapplication

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    supportActionBar?.hide() // +1 untuk ini, ngilangin actionbar agar terlihat lebih clean dan ngikutin GDD

    val btnPemainGunting = findViewById<ImageView>(R.id.pemainSatu)
    val btnPemainBatu = findViewById<ImageView>(R.id.pemainDua)
    val btnPemainKertas = findViewById<ImageView>(R.id.pemainTiga)

    val btnComKertas = findViewById<ImageView>(R.id.comSatu)
    val btnComGunting = findViewById<ImageView>(R.id.comDua)
    val btnComBatu = findViewById<ImageView>(R.id.comTiga)

    val btnReset = findViewById<ImageView>(R.id.btnReset)
    val txtMiddle = findViewById<TextView>(R.id.textVersus)

//  Logika pemrograman akan berjalan ketika salah satu gambar pemain ditekan
    btnPemainGunting.setOnClickListener {
      btnPemainGunting.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..3).random() // kalau bisa penamaan variable camel case, jangan snake case
      printLog("Pemain Gunting")

//    membuat button tidak dapat ditekan kembali sebelum mereset
      btnPemainGunting.isClickable = false
      btnPemainBatu.isClickable = false
      btnPemainKertas.isClickable = false
      if (computer_move == 1) { // ini bisa di ganti jadi when mas
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2) {
        printLog("Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        printLog("Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3) {
        printLog("Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

//  Logika pemrograman akan berjalan ketika salah satu gambar pemain ditekan
    btnPemainBatu.setOnClickListener {
      btnPemainBatu.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..3).random()
      printLog("Pemain Batu")

//    membuat button tidak dapat ditekan kembali sebelum mereset
      btnPemainGunting.isClickable = false
      btnPemainBatu.isClickable = false
      btnPemainKertas.isClickable = false // +1 untuk error handling, di disable biar ga bisa di click, nice one
      if (computer_move == 1) { // bisa di ganti jadi when
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2) {
        printLog("Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3) {
        printLog("Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        Log.d(MainActivity::class.java.simpleName, "Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

//  Logika pemrograman akan berjalan ketika salah satu gambar pemain ditekan
    btnPemainKertas.setOnClickListener {
      btnPemainKertas.setBackgroundColor(Color.rgb(103, 224, 213))
      val computer_move = (1..3).random()
      printLog("Pemain Kertas")

//    membuat button tidak dapat ditekan kembali sebelum mereset
      btnPemainGunting.isClickable = false
      btnPemainBatu.isClickable = false
      btnPemainKertas.isClickable = false
      if (computer_move == 1) { // codingan di sini banyak yang berulang dan copy paste, mungkin lebih baik kalau di pindah ke method/function
        printLog("Computer Kertas")
        btnComKertas.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "DRAW !"
        Log.d(MainActivity::class.java.simpleName, "Hasil Draw !")
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      } else if (computer_move == 2) {
        Log.d(MainActivity::class.java.simpleName, "Computer Gunting")
        btnComGunting.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Computer\nMENANG"
        printLog("Hasil Computer Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(17, 20, 194))
      } else if (computer_move == 3) {
        Log.d(MainActivity::class.java.simpleName, "Computer Batu")
        btnComBatu.setBackgroundColor(Color.rgb(103, 224, 213))
        txtMiddle.text = "Pemain\nMENANG"
        printLog("Hasil Pemain Menang !")
        txtMiddle.setTextSize(32F)
        txtMiddle.setTextColor(Color.rgb(255, 225, 255))
        txtMiddle.setBackgroundColor(Color.rgb(50, 224, 70))
      }
    }

    btnReset.setOnClickListener {
      btnPemainGunting.setBackgroundResource(0)
      btnPemainKertas.setBackgroundResource(0)
      btnPemainBatu.setBackgroundResource(0)
      btnComKertas.setBackgroundResource(0)
      btnComGunting.setBackgroundResource(0)
      btnComBatu.setBackgroundResource(0)

      txtMiddle.text = "VS"
      txtMiddle.setBackgroundResource(0)

//    mengembalikan fungsi tombol agar dapat ditekan kembali
      btnPemainGunting.isClickable = true
      btnPemainBatu.isClickable = true
      btnPemainKertas.isClickable = true
    }
  }

  private fun printLog(text: String) {
    Log.d(MainActivity::class.java.simpleName, text)
  }
}
