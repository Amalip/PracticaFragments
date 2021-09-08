package com.amalip.practicafragments2

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment

class RedFragment : Fragment(R.layout.fragment_red) {

    private val TEXT_KEY = "TEXT_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            context,
            savedInstanceState?.getString(TEXT_KEY, "") ?: "",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString(TEXT_KEY, "LA PANTALLA HA ROTADO")
        }
        super.onSaveInstanceState(outState)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(context, requireArguments().getString("key", ""), Toast.LENGTH_SHORT).show()
    }

}