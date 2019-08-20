package com.wangyang.baselibrary.wechat.`interface`

import com.example.annotations.PayEntryGenerator
import com.wangyang.baselibrary.wechat.impl.PayWXEntryImpl

@SuppressWarnings("unused")
@PayEntryGenerator(packageName = "com.example.wangyang",payEntryTemplate = PayWXEntryImpl::class )

interface WXPayEntry {

}