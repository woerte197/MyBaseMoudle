package com.wangyang.baselibrary.pay.wechat

import com.tencent.mm.opensdk.modelpay.PayReq
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import com.wangyang.baselibrary.config.ConfigManager
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class WechatPayManager() {
    companion object {
        val INS: WechatPayManager by lazy { WechatPayManager() }

    }

    fun WechatPayBeanToPayReq(wechatPayBean: WechatPayBean): PayReq {
        val payReq = PayReq()
        payReq.appId = wechatPayBean.appid
        payReq.extData = wechatPayBean.extData
        payReq.nonceStr = wechatPayBean.noncestr
        payReq.packageValue = wechatPayBean.packages
        payReq.partnerId = wechatPayBean.partnerid
        payReq.prepayId = wechatPayBean.prepayid
        payReq.sign = wechatPayBean.sign
        payReq.timeStamp = wechatPayBean.timestamp
        return payReq
    }


}