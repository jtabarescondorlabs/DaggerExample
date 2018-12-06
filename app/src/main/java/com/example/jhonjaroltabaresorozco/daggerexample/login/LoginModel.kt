package com.example.jhonjaroltabaresorozco.daggerexample.login

class LoginModel(val repository: LoginRepository) : LoginActivityMVP.Model {

    override fun createUser(id: Int, name: String, lastName: String) {
        repository.saveUser(User(0, name, lastName))
    }

    override fun getUser() : User {
        return repository.getUser()
    }

}