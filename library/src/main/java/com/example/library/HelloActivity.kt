package com.example.library

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hello.Hello
import kotlinx.android.synthetic.main.activity_hello.*

fun newIntent(context: Context) = Intent(context, HelloActivity::class.java)

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        tv_text.text = Hello.sayHello()
    }
}
