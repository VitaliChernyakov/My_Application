package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.title)
        textView.setOnClickListener {
            openSecondActivity()


            openUrl("http://google.com")
        }
    }

    private fun openSecondActivity() {

        val intent = Intent(this, SecondActivity::class.java)
//        intent.putExtra(KEY_EXTRA_STRING, "TEXT")
        startActivity(intent)

    }

    fun openUrl(url: String){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }


}



