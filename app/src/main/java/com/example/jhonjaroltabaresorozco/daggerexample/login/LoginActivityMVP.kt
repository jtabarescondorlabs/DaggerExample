package com.example.jhonjaroltabaresorozco.daggerexample.login

interface LoginActivityMVP {

    interface View {

        fun getFirstName() : String
        fun getLastName() : String

        fun showUserNotAvailable()
        fun showInputError()

        fun setFirstName(firstName : String)
        fun setLastName(lastName : String)

        fun showUserSavedMessage()

    }

    interface Presenter {

        fun setView(view: LoginActivityMVP.View)

        fun loginButtonClicked()

        fun getCurrentUser()

    }

    interface Model {

        fun createUser(id: Int, name : String, lastName : String)

        fun getUser(): User

    }

}