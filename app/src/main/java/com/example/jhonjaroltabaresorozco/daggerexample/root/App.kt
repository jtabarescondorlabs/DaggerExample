package com.example.jhonjaroltabaresorozco.daggerexample.root

import android.app.Application
import com.example.jhonjaroltabaresorozco.daggerexample.login.LoginModule

class App : Application() {

    lateinit var applicationComponent: ApplicationComponent

    // For construct first time commend this block
    private fun initDagger(app: App): ApplicationComponent =
            DaggerApplicationComponent.builder()
                    .applicationModule(ApplicationModule(app))
                    .loginModule(LoginModule())
                    .build()


    override fun onCreate() {
        super.onCreate()
        applicationComponent = initDagger(this)

    }

}
