package com.example.curriculum_vitea.Fragments

import com.example.curriculum_vitea.WebViewActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.curriculum_vitea.R

class Contact : Fragment() {


    lateinit var linkedInBtn : Button
    lateinit var twitterBtn : Button
    lateinit var facebookBtn : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view  = inflater.inflate(R.layout.fragment_contact, container, false)
        linkedInBtn = view.findViewById(R.id.linkedInBtnContactFragment)
        twitterBtn = view.findViewById(R.id.twitterBtn)
        facebookBtn = view.findViewById(R.id.facebookBtn)

        linkedInBtn.setOnClickListener {
            makeSomeIntents("linkedIn")
        }
        twitterBtn.setOnClickListener {
            makeSomeIntents("twitter")
        }
        facebookBtn.setOnClickListener {
            makeSomeIntents("facebook")
        }

        return view
    }

    fun makeSomeIntents(destination: String) {
        val intent = Intent(getActivity(), WebViewActivity::class.java)
        var link: String?
        when(destination) {
            "linkedIn" -> link = "http://www.linkedin.com/in/medhat-meebed-\uF8FF-b2691b51"
            "twitter" -> link = "https://twitter.com/"
            "facebook" -> link = "https://facebook.com"
            else -> link = "https://www.google.com"
        }
        intent.putExtra("link",link)
        startActivity(intent)

    }


}
