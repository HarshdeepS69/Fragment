package com.harsh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harsh.fragments.Fragments.NewFragment
import com.harsh.fragments.Fragments.SecondFragment
import com.harsh.fragments.Interfaces.ActivityInterface
import com.harsh.fragments.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {
   lateinit var activityInterface : ActivityInterface
    val binding by lazy {
        ActivityNewBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener(){
            activityInterface.updateText(binding.edtTxtz.text.toString())
        }
    }


}