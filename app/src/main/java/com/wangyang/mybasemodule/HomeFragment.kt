package com.wangyang.mybasemodule

import android.os.Bundle
import com.wangyang.baselibrary.ui.fragment.BaseMvpFragment
import org.jetbrains.anko.support.v4.toast

class HomeFragment : BaseMvpFragment<HomePresenter>(), HomeView {


    override fun setLayout(): Int {
        return R.layout.test1
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mPresenter = HomePresenter()
        mPresenter.mView = this
        toast("sad")
    }

    override fun showData() {

    }

}