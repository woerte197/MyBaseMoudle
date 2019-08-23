package com.example.user_moudle.provider

import com.alibaba.android.arouter.facade.annotation.Route
import com.example.router_lib.provider.base.BaseProvider
import com.example.router_lib.provider.moudle.user.IUserProvider
@Route(path = IUserProvider.USER_SERVICE)
class UserProvider : BaseProvider(), IUserProvider {
    override fun init() {

    }

    override fun isLogin() {

    }
}