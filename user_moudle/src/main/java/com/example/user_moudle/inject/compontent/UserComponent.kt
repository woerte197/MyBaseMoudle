package com.example.user_moudle.inject.compontent

import com.example.user_moudle.ui.UserLoginActivity
import com.example.user_moudle.inject.module.UserModule
import dagger.Component

@Component(modules = [UserModule::class])
interface UserComponent {

    fun inject(activity: UserLoginActivity)
}