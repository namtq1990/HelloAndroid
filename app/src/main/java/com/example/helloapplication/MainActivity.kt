package com.example.helloapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library.newIntent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.setOnClickListener {
            startActivity(newIntent(this))
        }
    }
}
