package com.wangyang.mybasemodule.test

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.router_lib.provider.base.BaseProvider
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.example.router_lib.provider.moudle.main.IMainProvider.Companion.MAIN_MAIN_SERVICE

@Route(path = MAIN_MAIN_SERVICE)
class MainProvider : BaseProvider(), IMainProvider {
    override fun isLogin() {

    }

    override fun init() {

    }



}