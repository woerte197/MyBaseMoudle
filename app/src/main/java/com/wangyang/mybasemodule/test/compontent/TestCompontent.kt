package com.wangyang.mybasemodule.test.compontent

import android.content.Context
import com.wangyang.baselibrary.injection.component.AppComponent
import com.wangyang.mybasemodule.HomeFragment
import com.wangyang.mybasemodule.MainActivity
import com.wangyang.mybasemodule.test.MyScope
import com.wangyang.mybasemodule.test.module.TestModule
import dagger.Component

@MyScope
@Component(modules = [TestModule::class], dependencies = [AppComponent::class])
interface TestCompontent {
    fun appContext(): Context
    fun inject(activity: MainActivity)
}