package com.wangyang.mybasemodule.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.wangyang.baselibrary.ui.activity.BaseActivity
import com.wangyang.mybasemodule.R
import com.wangyang.mybasemodule.TestJ

@Route(path = IMainProvider.MAIN_TEST_ACTIVITY)
class Test2Activity : BaseActivity() {
    @JvmField
    @Autowired
    var sad: TestJ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }
}
