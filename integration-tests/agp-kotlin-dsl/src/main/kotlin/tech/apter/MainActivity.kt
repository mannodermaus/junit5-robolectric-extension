package tech.apter

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(LinearLayout(this).apply {
            val textView = TextView(this@MainActivity).apply {
                text = "Hello World!"
            }

            val button = Button(this@MainActivity).apply {
                text = "Click me"
                setOnClickListener {
                    textView.text = "Changed"
                }
            }

            addView(textView)
            addView(button)
        })
    }
}
