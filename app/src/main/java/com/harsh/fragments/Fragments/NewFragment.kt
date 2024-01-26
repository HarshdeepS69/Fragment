package com.harsh.fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harsh.fragments.Interfaces.ActivityInterface
import com.harsh.fragments.NewActivity
import com.harsh.fragments.R
import com.harsh.fragments.databinding.FragmentNewBinding


class NewFragment() : Fragment(),ActivityInterface {
   lateinit var  binding :FragmentNewBinding
    var newActivity : NewActivity ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newActivity = activity as NewActivity
        newActivity?.activityInterface = this


        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding =  FragmentNewBinding.inflate(inflater,container,false)
       // return inflater.inflate(R.layout.fragment_new, container, false)
        return binding.root


        }




    companion object {

}

    override fun updateText(text: String) {
       binding.txtTxt.setText(text)
    }


}