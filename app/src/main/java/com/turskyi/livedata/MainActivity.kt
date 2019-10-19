package com.turskyi.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @Description By clicking on "Hello" word changes on another word.
 * Simple demonstration of LiveData
 *  */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liveData = DataController.getInstance().getData()

        textView.setOnClickListener{
            liveData.observe(this, Observer {
                if (textView.text != it){
                    textView.text = it
                } else {
                    textView.text = getString(R.string.hello_again)
                }
            })
        }
    }
}
