package com.example.jhonjaroltabaresorozco.daggerexample.login

class LoginActivityPresenter (var model: LoginActivityMVP.Model) : LoginActivityMVP.Presenter{

    private var view: LoginActivityMVP.View? = null

    override fun setView(view: LoginActivityMVP.View) {
        this.view = view
    }

    override fun loginButtonClicked() {
        if (view != null){
            if (view!!.getFirstName().trim().equals("") || view!!.getLastName().trim().equals("")){
                view!!.showInputError()
            } else {
                model.createUser(0, view!!.getFirstName(), view!!.getLastName())
                view!!.showUserSavedMessage()
            }
        }
    }

    override fun getCurrentUser() {
        var user: User? = null

        model.run { user = getUser() }
        user?.run { view?.setFirstName(name)
        view?.setLastName(lastName)}

    }

}