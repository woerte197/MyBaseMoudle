package com.wangyang.mybasemodule.test

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.tencent.mm.opensdk.utils.Log
import com.wangyang.baselibrary.ui.activity.BaseMvpActivity
import com.wangyang.mybasemodule.MainPresenter
import com.wangyang.mybasemodule.R
import com.wangyang.mybasemodule.TestJ

@Route(path = IMainProvider.MAIN_MAIN_ACTIVITY)
class TestActivity : BaseMvpActivity<MainPresenter>() {
    override fun inject() {

    }

    @JvmField
    @Autowired
    var sad: TestJ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)
        Log.e(localClassName, sad.toString())
    }

}