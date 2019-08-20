package com.wangyang.mybasemodule

import android.view.View
import com.wangyang.baselibrary.recycle.holder.BaseRecycleHolder
import com.wangyang.baselibrary.recycle.IEntity
import com.wangyang.baselibrary.recycle.ITypeHandle

class TestHandleType : ITypeHandle {
    companion object {
        const val TEST_HOLDER_LAYOUT = R.layout.test
        const val TEST_HOLDER_LAYOUT_TWO = R.layout.two
    }

    override fun createItemViewHolder(viewType: Int, view: View): BaseRecycleHolder<*> {
        return when (viewType) {
            TEST_HOLDER_LAYOUT -> {
                TestHolder(view)
            }
            TEST_HOLDER_LAYOUT_TWO -> {
                TestHolder(view)
            }
            else -> {
                throw NullPointerException("NO THIS TYPE!")
            }
        }
    }

    override fun getViewType(entity: IEntity): Int {
        return when (entity.itemType) {
            Value.TEST_TYPE -> {
                TEST_HOLDER_LAYOUT
            }
            Value.TEST_TYPE_TWO -> {
                TEST_HOLDER_LAYOUT_TWO
            }
            else -> {
                0
            }
        }
    }

}