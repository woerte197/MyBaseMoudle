package com.wangyang.mybasemodule

import com.wangyang.baselibrary.recycle.adapter.BaseRecycleAdapter
import com.wangyang.baselibrary.recycle.holder.BaseRecycleHolder
import android.view.View

class TestHolder(itemView:View): BaseRecycleHolder<test1>(itemView) {


    override fun setView(entity: test1, adapter: BaseRecycleAdapter, position: Int) {
    }

}