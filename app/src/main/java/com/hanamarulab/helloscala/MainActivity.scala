package com.hanamarulab.helloscala

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {
    override def onCreate(savedInstanceState: Bundle): Unit= {
        super.onCreate(savedInstanceState)
        val textView = new TextView(this)
        textView.setText("Hello, Scala!")
        setContentView(textView)
    }
}