package com.bzy.customsnackbar

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar
import kotlinx.android.synthetic.main.custom_snackbar_view.view.*

class CustomSnackBar(
    parent: ViewGroup,
    content: CustomSnackBarView
) : BaseTransientBottomBar<CustomSnackBar>(parent, content, content) {


    init {
        getView().setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                android.R.color.transparent
            )
        )
        //getView().setPadding(0, 0, 0, 0)
    }


    companion object {


        fun success(view: View, title: String, message: String, image: Int): CustomSnackBar {

            // First we find a suitable parent for our custom view
            val parent = view.findSuitableParent() ?: throw IllegalArgumentException(
                "No suitable parent found from the given view. Please provide a valid view."
            )

            // We inflate our custom view
            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.custom_snack_bar,
                parent,
                false
            ) as CustomSnackBarView

            // Here you access to the image and text of the snackBar
            customView.title_snack.text = title
            customView.message_snack.text = message
            customView.image_snack.setImageResource(image)
            customView.btn_snack.setOnClickListener {
                Toast.makeText(customView.context,"Hello There",Toast.LENGTH_SHORT).show()
            }

            // We create and return our Snackbar
            return CustomSnackBar(
                parent,
                customView
            )
        }

        fun error(view: View, title: String, message: String, image: Int): CustomSnackBar {

            // First we find a suitable parent for our custom view
            val parent = view.findSuitableParent() ?: throw IllegalArgumentException(
                "No suitable parent found from the given view. Please provide a valid view."
            )

            // We inflate our custom view
            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.custom_snack_bar,
                parent,
                false
            ) as CustomSnackBarView

            // Here you access to the image and text of the snackBar
            customView.title_snack.text = title
            customView.message_snack.text = message
            customView.image_snack.setImageResource(image)
            customView.btn_snack.setOnClickListener {
                Toast.makeText(customView.context,"Hello There",Toast.LENGTH_SHORT).show()
            }

            // We create and return our Snackbar
            return CustomSnackBar(
                parent,
                customView
            )
        }

        fun info(view: View, title: String, message: String, image: Int): CustomSnackBar {

            // First we find a suitable parent for our custom view
            val parent = view.findSuitableParent() ?: throw IllegalArgumentException(
                "No suitable parent found from the given view. Please provide a valid view."
            )

            // We inflate our custom view
            val customView = LayoutInflater.from(view.context).inflate(
                R.layout.custom_snack_bar,
                parent,
                false
            ) as CustomSnackBarView

            // Here you access to the image and text of the snackBar
            customView.title_snack.text = title
            customView.message_snack.text = message
            customView.image_snack.setImageResource(image)
            customView.btn_snack.setOnClickListener {
                Toast.makeText(customView.context,"Hello There",Toast.LENGTH_SHORT).show()
            }

            // We create and return our Snackbar
            return CustomSnackBar(
                parent,
                customView
            )
        }

    }


}