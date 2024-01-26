package com.harsh.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harsh.fragments.Fragments.FirstFragment
import com.harsh.fragments.Fragments.SecondFragment
import com.harsh.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(){
            var manager = supportFragmentManager
            var transaction = manager.beginTransaction()
            transaction.replace(R.id.fcv,FirstFragment())
            transaction.commit()
        }
        binding.btn2.setOnClickListener(){
            var manager = supportFragmentManager
            var transacton = manager.beginTransaction()
            transacton.replace(R.id.fcv,SecondFragment())
            transacton.commit()
        }

    }
}