package com.example.jhonjaroltabaresorozco.daggerexample.login

class MemoryRepository: LoginRepository {


    var test:User?=null


    override fun getUser(): User {

        if (test==null) {
            test = User(0,"Jhon", "Tabares")
            return test as User
        }
        else
        {
            return test as User
        }
    }

    override fun saveUser(user: User) {
        if (user===null){
            test = getUser()
        } else {
            this.test = user
        }
    }


}