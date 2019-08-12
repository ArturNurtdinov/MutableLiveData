package com.example.livedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = MutableLiveData<String>()

        data.observe(this, Observer { t -> text_view.append("\n $t") })
        //every click will add new line in text_view
        var counter = 0
        button.setOnClickListener {
            data.value = "data $counter"
            ++counter
        }
    }
}
