package com.example.jhonjaroltabaresorozco.daggerexample.root

import com.example.jhonjaroltabaresorozco.daggerexample.login.LoginActivity
import com.example.jhonjaroltabaresorozco.daggerexample.login.LoginModule

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = [ApplicationModule::class, LoginModule::class])
interface ApplicationComponent {

    fun inject(app: App)
    fun inject(target: LoginActivity)

}
