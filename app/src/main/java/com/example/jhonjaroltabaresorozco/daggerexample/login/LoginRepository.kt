package com.example.jhonjaroltabaresorozco.daggerexample.login

interface LoginRepository {

    fun getUser(): User
    fun saveUser(user: User)

}