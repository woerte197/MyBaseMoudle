package com.wangyang.mybasemodule

import com.wangyang.baselibrary.presenter.view.BaseView

interface MainView : BaseView {
    fun onResult(msg: String)
    fun onLoadData(msg: String)

}