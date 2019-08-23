package com.example.user_moudle.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.router_lib.provider.moudle.user.IUserProvider
import com.example.user_moudle.R
import com.example.user_moudle.inject.compontent.DaggerUserComponent
import com.example.user_moudle.presenter.LoginPresenter
import com.example.user_moudle.presenter.view.LoginView
import com.wangyang.baselibrary.ui.activity.BaseMvpActivity

@Route(path = IUserProvider.USER_LOGIN)
class UserLoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {


    override fun inject() {
        DaggerUserComponent.builder().build().inject(this)
        mPresenter.mView = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
    }
}
