package com.example.router_lib.router

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.launcher.ARouter
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.example.router_lib.provider.moudle.user.IUserProvider

class RouterManager {

    companion object {
        val INS: RouterManager by lazy { RouterManager() }
    }

    init {
        ARouter.getInstance().inject(this)
    }

    @JvmField
    @Autowired
    var mainProvider: IMainProvider? = null


    @JvmField
    @Autowired
    var userProvider: IUserProvider? = null

    fun getMainProvider(): IMainProvider {
        if (null == mainProvider) {
            mainProvider = ARouter.getInstance().build(IMainProvider.MAIN_MAIN_SERVICE).navigation() as IMainProvider
        }
        return mainProvider as IMainProvider
    }

    fun getUserProvider(): IUserProvider {
        if (null == userProvider) {
            userProvider = ARouter.getInstance().build(IUserProvider.USER_SERVICE).navigation() as IUserProvider
        }
        return userProvider as IUserProvider
    }

}