package com.colgis.greenline

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
          fun logoutClick(view: View){
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
         }


}

