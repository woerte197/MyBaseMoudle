package com.wangyang.mybasemodule

import android.content.Context
import android.os.Handler
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.wangyang.baselibrary.presenter.BasePresenter
import com.wangyang.baselibrary.recycle.adapter.FooterRecycleAdapter
import com.wangyang.baselibrary.recycle.IEntity
import com.wangyang.baselibrary.recycle.refresh.RefreshHandler
import javax.inject.Inject

class MainPresenter @Inject constructor() : BasePresenter<MainView>(), RefreshHandler.RefreshListener {
    override fun loadBottom(pageSize: Int) {
        val entities = ArrayList<IEntity>()
        for (i in 0..18) {
            entities.add(test1("wang", 16, Value.TEST_TYPE_TWO))
        }
        Handler().postDelayed({
            adapter!!.addLoadData(entities)
            refreshHandler!!.setLoaded(true)
            mView.onLoadData("加载成功")
        }, 2000)
    }

    private var refreshHandler: RefreshHandler? = null
    private var adapter: FooterRecycleAdapter? = null
    fun loadData(context: Context, recyclerView: RecyclerView) {
        val entities = ArrayList<IEntity>()
        for (i in 0..19) {
            entities.add(test1("wang", 16, Value.TEST_TYPE))
        }
        recyclerView.layoutManager = GridLayoutManager(context, 1)
        adapter = FooterRecycleAdapter(context, entities, TestHandleType())
        refreshHandler = RefreshHandler(adapter!!, recyclerView)
        refreshHandler!!.setRefreshListener(this)
        mView.onResult("请求成功")
    }
}