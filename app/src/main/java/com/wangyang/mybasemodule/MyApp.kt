package com.wangyang.mybasemodule

import com.wangyang.baselibrary.BaseApplication
import com.wangyang.baselibrary.config.ConfigManager

class MyApp : BaseApplication() {


    override fun onCreate() {
        super.onCreate()
        ConfigManager.init(this)
                .addWechatAppId("sadsadsadsad")
                .addHostUrl("http://www.baidu.com")
                .build()
        isDebug = true
    }




}