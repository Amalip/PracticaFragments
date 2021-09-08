package com.amalip.practicafragments2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, WelcomeFragment()).commit()

        findViewById<Button>(R.id.btnRedFragment).setOnClickListener {
            replaceFragment(RedFragment().apply {
                arguments = Bundle().apply {
                    putString("key", "This is red fragment")
                }
            })
        }

        findViewById<Button>(R.id.btnBlueFragment).setOnClickListener {
            replaceFragment(BlueFragment().apply {
                arguments = Bundle().apply {
                    putString("key", "This is blue fragment")
                }
            })
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            setCustomAnimations(
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right
            )
            replace(R.id.container, fragment)
            addToBackStack(fragment.tag)
            commit()
        }
    }

}