package com.furkancolak.kotlinlearning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Variables
        /*
        var değişkeni ile tanımlama yapılırsa atanan değer sonradan değiştirilebilir satır 26-30 gibi
        val ile deger atanırsa atanan değer bir daha değiştirilemez
         */
        var x = 5
        var y = 4
        println(x*y) // 20
        var a = 10
        var b = 20
        println(b/a) // 2
        println("b/a") // b/a
        a = 11
        println(a) // 11

        val name = "Furkan"
        println(name)

        // 39-40 satırlarda myInteger adlı değişkenin INT olduğunu belirttik ve INT değer atadık
        // String veya başka bir değişken ataması yapılamaz val ile atama yapıldığı için de atanan deger daha değiştirilemez
        val myInteger : Int // tanımlama yapıldı
        myInteger = 10 // değeri atandı

        //Asağıda aynı satırda hem tanımlama hemde değer atama islemi yapıldı
        val myInteger2 : Int = 10

        // Double & Float


    }
}