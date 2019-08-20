package com.wangyang.baselibrary.wechat.impl

import com.wangyang.baselibrary.wechat.base.BaseWXEntryActivity
import com.wangyang.baselibrary.wechat.base.WechatUtil

class WXEntryImpl : BaseWXEntryActivity() {
    override fun signSuccess() {
        WechatUtil.INS.signSuccess.invoke("登录成功")
    }

    override fun onResume() {
        super.onResume()
        finish()
        overridePendingTransition(0, 0)
    }

}