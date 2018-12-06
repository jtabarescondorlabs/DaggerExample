package com.example.jhonjaroltabaresorozco.daggerexample.login

import dagger.Module
import dagger.Provides

@Module
class LoginModule {

    @Provides
    internal fun provideLoginActivityPresenter (model: LoginActivityMVP.Model): LoginActivityMVP.Presenter{
        return LoginActivityPresenter(model)
    }

    @Provides
    internal fun provideLoginActivityModel (repository: LoginRepository): LoginActivityMVP.Model{
        return LoginModel(repository)
    }

    @Provides
    fun provideLoginRepository (): LoginRepository{
        return MemoryRepository()
    }

}