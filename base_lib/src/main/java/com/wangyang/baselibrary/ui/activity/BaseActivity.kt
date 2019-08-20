package com.wangyang.baselibrary.ui.activity

import android.support.v7.app.AppCompatActivity
import com.wangyang.baselibrary.BaseApplication
import com.wangyang.baselibrary.injection.component.AppComponent

abstract class BaseActivity : AppCompatActivity() {
    companion object {
        val appComponent: AppComponent? = BaseApplication.appComponent
    }

}