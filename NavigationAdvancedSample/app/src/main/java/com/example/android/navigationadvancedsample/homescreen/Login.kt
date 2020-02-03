package com.example.android.navigationadvancedsample.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.R

class Login : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val options = NavOptions.Builder()
                .setPopUpTo(R.id.home, false)
                .build()
        view.findViewById<TextView>(R.id.loginTxt).setOnClickListener {
            findNavController().navigate(R.id.action_login_to_home, null, options)
        }

        return view
    }
}