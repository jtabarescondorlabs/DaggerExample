package com.example.jhonjaroltabaresorozco.daggerexample.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.jhonjaroltabaresorozco.daggerexample.R
import com.example.jhonjaroltabaresorozco.daggerexample.root.App
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginActivityMVP.View {

    override fun getFirstName(): String {
        return firstName.text.toString()
    }

    override fun getLastName(): String {
        return lastName.text.toString()
    }

    override fun showUserNotAvailable() {
        Toast.makeText(this, "First Name or last name cannot be empty", Toast.LENGTH_SHORT).show()
    }

    override fun showInputError() {
        Toast.makeText(this, "First Name or last name cannot be empty", Toast.LENGTH_SHORT).show()
    }

    override fun setFirstName(firstName: String) {
        this.firstName.setText(firstName)
    }

    override fun setLastName(lastName: String) {
        this.lastName.setText(lastName)
    }

    override fun showUserSavedMessage() {
        Toast.makeText(this, "User saved successfully", Toast.LENGTH_SHORT).show()
    }

    lateinit var firstName : EditText
    lateinit var lastName : EditText
    lateinit var login : Button

    @Inject
    lateinit var presenter: LoginActivityMVP.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).applicationComponent.inject(this)

        firstName = findViewById(R.id.loginActivity_firstName_editText)
        lastName = findViewById(R.id.loginActivity_lastName_editText)
        login = findViewById(R.id.loginActivity_login_button)

        login.setOnClickListener {
            presenter.loginButtonClicked()
        }

    }

    override fun onResume() {
        super.onResume()
        presenter.setView(this)
        presenter.getCurrentUser()
    }

}
