
package com.rachid.jarvis

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(12, 12, 25))

        val title = TextView(this)
        title.text = "J.A.R.V.I.S"
        title.textSize = 34f
        title.setTextColor(Color.rgb(150, 120, 255))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "PERSONAL AI ASSISTANT"
        subtitle.textSize = 14f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "أنا هنا سيدي. كيف يمكنني مساعدتك؟"
        status.textSize = 18f
        status.setTextColor(Color.WHITE)
        status.gravity = Gravity.CENTER
        status.setPadding(0, 60, 0, 40)

        val button = Button(this)
        button.text = "تشغيل JARVIS"

        button.setOnClickListener {
            status.text = "أنا جاهز سيدي!"
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
