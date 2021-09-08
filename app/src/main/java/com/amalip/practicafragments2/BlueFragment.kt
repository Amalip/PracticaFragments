package com.amalip.practicafragments2

import android.widget.Toast
import androidx.fragment.app.Fragment

class BlueFragment : Fragment(R.layout.fragment_blue) {

    override fun onResume() {
        super.onResume()

        Toast.makeText(context, requireArguments().getString("key", ""), Toast.LENGTH_SHORT).show()
    }

}