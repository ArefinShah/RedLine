package com.colgis.greenline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

        fun loginClick(view: View){
            val intent = Intent(this@Main2Activity, MainActivity::class.java)
            startActivity(intent)
        }

}
