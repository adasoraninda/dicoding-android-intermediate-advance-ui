package com.adasoraninda.mycustomview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_custom_button).setOnClickListener {
            startActivity(Intent(this, ButtonActivity::class.java))
        }

        findViewById<Button>(R.id.button_custom_view).setOnClickListener {
            startActivity(Intent(this, TicketActivity::class.java))
        }

        findViewById<Button>(R.id.button_canvas_like).setOnClickListener {
            startActivity(Intent(this, LikeActivity::class.java))
        }

        findViewById<Button>(R.id.button_web_view).setOnClickListener {
            startActivity(Intent(this, WebViewActivity::class.java))
        }
    }

}