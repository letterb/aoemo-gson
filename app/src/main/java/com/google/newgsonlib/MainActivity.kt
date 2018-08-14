package com.google.newgsonlib

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //第一个参数解密的key，第二个参数是否debug（true 解密注解 false 解密注解）
        Gson.init(BuildConfig.APPLICATION_ID,BuildConfig.DEBUG)
        val b=Bean("weijiale",18)
        val toJson = Gson().toJson(b)
        print(toJson)
    }
    data class Bean(@SerializedName("123") val name:String,
                    @SerializedName("321")val age:Int)
}
