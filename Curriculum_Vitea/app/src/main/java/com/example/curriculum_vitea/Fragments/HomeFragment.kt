package com.example.curriculum_vitea.Fragments

import com.example.curriculum_vitea.WebViewActivity
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.fragment.app.Fragment
import com.example.curriculum_vitea.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(){

    lateinit var linkedInBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        linkedInBtn = view.findViewById(R.id.linkedInBtnHomeFragment)
        linkedInBtn.setOnClickListener {
            linkedBtnPressed()
        }
        return view

    }

    override fun onStart() {
        super.onStart()

        roundImage()
    }


    private fun roundImage() {
        val img = BitmapFactory.decodeResource(resources, R.drawable.img_5116)
        val round = RoundedBitmapDrawableFactory.create(resources,img)
        round.isCircular = true
        imageView.setImageDrawable(round)
    }

    //Actions
    fun linkedBtnPressed(){
        val intent = Intent (getActivity(), WebViewActivity::class.java)
        intent.putExtra("link","http://www.linkedin.com/in/medhat-meebed-\uF8FF-b2691b51")
        activity?.startActivity(intent)


    }

}
