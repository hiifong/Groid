package cc.hiifong.groid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import cc.hiifong.groid.activity.LoginActivity
import cc.hiifong.groid.activity.core.ActivityCollector
import cc.hiifong.groid.activity.core.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.button);
        btn.text = "退出程序"
        btn.setOnClickListener {
//            ActivityCollector.finishAll()
            var username:String = "hiifong"
            var password:String = "123456"
            var intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            startActivity(intent)
        }
    }
}