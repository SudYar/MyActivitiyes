package com.example.myactivitiyes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2)
            .setOnClickListener {

                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
    }
}
//    public var timer: CountDownTimer? = null
//    private var tw: TextView? = null
//        tw = findViewById<TextView>(R.id.textView)
//        findViewById<Button>(R.id.button)
//            .setOnClickListener {
//                startTimer(60000)
//            }
//    private fun startTimer(timeMillis: Long){
//        timer?.cancel()
//        timer = object : CountDownTimer(timeMillis, 1){
//            override fun onTick(millisUntilFinished: Long) {
//                val seconds: Long = millisUntilFinished / 1000
//                tw!!.text = seconds.toString()
//            }
//
//            override fun onFinish() {
//                tw!!.text = "Finish"
//            }
//
//        }.start()
//    }
