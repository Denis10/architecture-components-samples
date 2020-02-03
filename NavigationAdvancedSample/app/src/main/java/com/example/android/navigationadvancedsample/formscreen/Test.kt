package com.example.android.navigationadvancedsample.formscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.MainRouter
import com.example.android.navigationadvancedsample.R

class Test : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test, container, false)
        view.findViewById<TextView>(R.id.testTxt).setOnClickListener {
//            findNavController().popBackStack(R.id.form, true)
            (requireActivity() as MainRouter).route()
        }
        return view
    }
}