package com.wangyang.baselibrary.wechat.`interface`

import com.example.annotations.AppRegisterGenerator
import com.example.annotations.PayEntryGenerator
import com.wangyang.baselibrary.wechat.impl.PayWXEntryImpl

@SuppressWarnings("unused")
@AppRegisterGenerator(packageName = "com.example.wangyang", registerTemplate = AppRegisterEntry::class)
interface AppRegisterEntry