package com.example.admin.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.homescreen.*

class MainActivity : AppCompatActivity() {

    var photo : ImageView?= null
    var eduButton: Button? = null
    var homeButton: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        photo=findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ProfilePhoto::class.java)
            startActivity(clickIntent)
        })

        eduButton=findViewById(R.id.education)
        eduButton?.setOnClickListener({
            var clickbutton = Intent(this@MainActivity, Education::class.java)
            startActivity(clickbutton)
        })

         homeButton=findViewById(R.id.workExp)
         homeButton?.setOnClickListener({
                    var clickwork = Intent(this@MainActivity,WorkExperience ::class.java)
                    startActivity(clickwork)
        })

    }
}
