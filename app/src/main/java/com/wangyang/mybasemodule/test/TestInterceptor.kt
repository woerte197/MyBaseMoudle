package com.wangyang.mybasemodule.test

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
import com.alibaba.android.arouter.launcher.ARouter
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.example.router_lib.provider.moudle.user.IUserProvider
import com.tencent.mm.opensdk.utils.Log

@Interceptor(priority = 3, name = "测试拦截器")
class TestInterceptor : IInterceptor {
    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        val address = postcard!!.path
        Log.e("TestInterceptor", address)
        if (address == IMainProvider.MAIN_MAIN_ACTIVITY) {
            postcard.destination = ARouter.getInstance().build(IUserProvider.USER_LOGIN).navigation()::class.java
        }
        //Warehouse.routes.get(postcard.getPath());
        callback!!.onContinue(postcard)
    }

    override fun init(context: Context?) {
    }

}