package com.example.jhonjaroltabaresorozco.daggerexample.root

import android.content.Context

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val app: App) {

    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    @Singleton
    fun provideContext(): Context = app

}
