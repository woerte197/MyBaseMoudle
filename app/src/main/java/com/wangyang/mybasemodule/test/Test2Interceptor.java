package com.wangyang.mybasemodule.test;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

@Interceptor(priority = 4)
public class Test2Interceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        Log.e("testService", Test2Interceptor.class.getName() + " has process.");
        //拦截跳转，进行一些处理
        if (postcard.getPath().equals("/test/test1")) {
            Log.e("testService", Test2Interceptor.class.getName() + " 进行了拦截处理！");
        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {
        Log.e("testService", Test2Interceptor.class.getName() + " has init.");
    }
}