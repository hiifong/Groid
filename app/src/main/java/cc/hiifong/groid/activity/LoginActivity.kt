package cc.hiifong.groid.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import cc.hiifong.groid.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var username = intent.getStringExtra("username")
        var password = intent.getStringExtra("password")
        var tv1:TextView = findViewById(R.id.textView)
        var tv2:TextView = findViewById(R.id.textView2)
        tv1.text = username
        tv2.text = password
    }
}