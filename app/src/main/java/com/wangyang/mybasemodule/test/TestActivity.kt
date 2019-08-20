package com.wangyang.mybasemodule.test

import android.os.Bundle
import com.wangyang.baselibrary.ui.activity.BaseActivity
import com.wangyang.mybasemodule.R

class TestActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
    }
}