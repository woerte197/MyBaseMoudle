package com.example.router_lib.provider.moudle.main

import com.example.router_lib.provider.base.IBaseProvider


interface IMainProvider : IBaseProvider {
    companion object {
        const val MAIN_MAIN_SERVICE = "/main0/main/service"
        const val MAIN_MAIN_ACTIVITY = "/main0/main/mainActivity"
        const val MAIN_TEST_ACTIVITY = "/main0/test/mainActivity"
    }

    fun isLogin()

}
