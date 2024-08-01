package com.mehdi.androidapp1

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // پیدا کردن ویجت‌ها توسط ID
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val resetButton: Button = findViewById(R.id.resetButton)

        // تنظیم listener برای دکمه
        button.setOnClickListener {
            // تغییر متن TextView
            textView.setText(R.string.button_clicked)

            // تغییر متن، رنگ و اندازه متن دکمه
            button.setText(R.string.button_clicked)
            button.setBackgroundColor(Color.GREEN)
            button.textSize = 24f
            button.setTypeface(null, Typeface.BOLD)
            button.setTextColor(Color.BLACK)

            // نمایش دکمه ریست
            resetButton.visibility = View.VISIBLE
        }

        // تنظیم listener برای دکمه ریست
        resetButton.setOnClickListener {
            // بازگرداندن وضعیت به حالت اولیه
            textView.setText(R.string.hello_world)
            button.setText(R.string.click_me)
            button.setBackgroundColor(Color.LTGRAY)
            button.textSize = 14f
            button.setTypeface(null, Typeface.NORMAL)
            button.setTextColor(Color.BLACK)

            // مخفی کردن دکمه ریست
            resetButton.visibility = View.GONE
        }
    }
}
