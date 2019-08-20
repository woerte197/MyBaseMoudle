package com.wangyang.baselibrary.wechat.`interface`

import com.example.annotations.EntryGenerator
import com.wangyang.baselibrary.wechat.impl.WXEntryImpl

@SuppressWarnings("unused")
@EntryGenerator(packageName = "com.example.wangyang", entryTemplate = WXEntryImpl::class)
interface WXEntry