package com.bzy.customsnackbar

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val snackBar = Snackbar.make(it, "", Snackbar.LENGTH_LONG)
            val customSnackView: View =
                layoutInflater.inflate(R.layout.custom_snackbar, null)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
            val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
            snackBarLayout.setPadding(0, 0, 0, 0)
            snackBarLayout.addView(customSnackView, 0)
            snackBar.show()
        }
    }
}