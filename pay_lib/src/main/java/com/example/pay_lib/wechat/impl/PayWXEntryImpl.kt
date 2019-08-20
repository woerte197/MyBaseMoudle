package com.wangyang.baselibrary.wechat.impl

import com.tencent.mm.opensdk.modelbase.BaseReq
import com.wangyang.baselibrary.wechat.base.BaseWXPayEntryActivity

class PayWXEntryImpl : BaseWXPayEntryActivity() {
    override fun onPaySuccess() {
        finish()
    }

    override fun onPayFail() {
        finish()
    }

    override fun onPayCancel() {
        finish()
    }

    override fun onReq(p0: BaseReq?) {
        finish()
    }

}