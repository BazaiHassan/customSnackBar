package com.bzy.customsnackbar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_snackbar_view.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            CustomSnackBar.success(it,"Success Message","This is message body",R.mipmap.ic_launcher).show()
        }
        button2.setOnClickListener {
            CustomSnackBar.error(it,"Error Message","This is message body",R.mipmap.ic_launcher).show()
        }

        button3.setOnClickListener {
            CustomSnackBar.info(it,"Info Message","This is message body",R.mipmap.ic_launcher).show()
        }
    }
}