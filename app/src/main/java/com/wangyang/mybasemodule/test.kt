package com.wangyang.mybasemodule

import com.wangyang.baselibrary.recycle.IEntity

data class test1(val name: String, val age: Int, override val itemType: Int ) : IEntity