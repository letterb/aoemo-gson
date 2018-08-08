package com.google.newgsonlib

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val s="{\"name\":\"yizisu\",\"age\":18}"
        val gson= Gson()
        val json = gson.fromJson<Bean>(s, Bean::class.java)
        println(json.toString())
        val b=Bean("222",1)
        val (name,age)=b
        name=="222"
    }
    data class Bean(val name:String,
                    val age:Int)
}
