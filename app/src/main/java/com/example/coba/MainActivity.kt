package com.example.coba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var inputUsername: TextInputLayout
    private lateinit var inputPassword: TextInputLayout
    private lateinit var mainLayout: ConstraintLayout
    lateinit var  mBundle: Bundle
    var vUsername: String = "admin"
    var vPassword: String = "admin"
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        val btnRegister: Button = findViewById(R.id.btnRegister)

        if(intent.getBundleExtra("register")!=null){
            getBundle()
        }

        btnRegister.setOnClickListener {
            val moveRegister = Intent( this@MainActivity,RegisterActivity::class.java)
            startActivity(moveRegister)
        }

        btnLogin.setOnClickListener(View.OnClickListener {
            var checkLogin = false
            val username: String = inputUsername.getEditText()?.getText().toString()
            val password: String = inputPassword.getEditText()?.getText().toString()

                if (username.isEmpty()) {
                    inputUsername.setError("Username must be filled with text")
                    checkLogin = false
                }

                if (password.isEmpty()) {
                    inputPassword.setError("Password must be filled with text")
                    checkLogin = false
                }

            if (username == vUsername && password == vPassword) {
                checkLogin=true
            }
            if(!checkLogin) {
                return@OnClickListener
            } else {
                val moveHome = Intent( this@MainActivity,HomeActivity::class.java)
                startActivity(moveHome)
            }

        })
    }
    fun getBundle(){
        mBundle = intent.getBundleExtra("register")!!
        vUsername = mBundle.getString("username")!!
        vPassword = mBundle.getString("password")!!

        inputUsername.editText?.setText(vUsername)
        inputPassword.editText?.setText(vPassword)
    }

}