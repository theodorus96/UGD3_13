package com.example.coba
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.isEmpty
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
class RegisterActivity : AppCompatActivity() {

    private lateinit var vName: TextInputLayout
    private lateinit var vUsername: TextInputLayout
    private lateinit var vPassword: TextInputLayout
    private lateinit var vBorndate : TextInputLayout
    private lateinit var vPhone : TextInputLayout
    private lateinit var vEmail : TextInputLayout
    private lateinit var nameInput : TextInputEditText
    private lateinit var usernameInput : TextInputEditText
    private lateinit var passwordInput : TextInputEditText
    private lateinit var phoneInput : TextInputEditText
    private lateinit var bornDateInput : TextInputEditText
    private lateinit var emailInput : TextInputEditText


    private lateinit var mainRegister: ConstraintLayout

    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        nameInput = findViewById(R.id.etName)
        usernameInput = findViewById(R.id.etUsername)
        passwordInput = findViewById(R.id.etPassword)
        phoneInput = findViewById(R.id.etPhoneNumber)
        bornDateInput = findViewById(R.id.etBornDate)
        emailInput = findViewById(R.id.etEmail)
        btnRegister= findViewById(R.id.btnRegister)
        mainRegister = findViewById(R.id.mainRegister)

        vName =  findViewById(R.id.tilName)
        vUsername = findViewById(R.id.tilUsername)
        vPassword =  findViewById(R.id.tilPassword)
        vPhone = findViewById(R.id.tilPhoneNumber)
        vBorndate =  findViewById(R.id.tilBornDate)
        vEmail =  findViewById(R.id.tilEmail)


        btnRegister.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            val mBundle = Bundle()

            val name : String = vName.getEditText()?.getText().toString()
            val username : String = vUsername.getEditText()?.getText().toString()
            val password : String = vPassword.getEditText()?.getText().toString()
            val email : String = vEmail.getEditText()?.getText().toString()
            val bornDate : String = vBorndate.getEditText()?.getText().toString()
            val phone : String = vPhone.getEditText()?.getText().toString()

            if(name.isEmpty()){
                nameInput.setError("Nama Tidak Boleh Kosong")
            }
            if(username.isEmpty()){
                usernameInput.setError("Username Tidak Boleh Kosong")
            }
            if(password.isEmpty()){
                passwordInput.setError("Password Tidak Boleh Kosong")
            }
            if(email.isEmpty()){
                emailInput.setError("Email Tidak Boleh Kosong")
            }
            if(bornDate.isEmpty()){
                bornDateInput.setError("Tanggal Lahir Tidak Boleh Kosong")
            }
            if(phone.isEmpty()){
                phoneInput.setError("Nomor Telepon Tidak Boleh Kosong")
            } else {
                mBundle.putString("nama", vName.getEditText()?.getText().toString())
                mBundle.putString("username", vUsername.getEditText()?.getText().toString())
                mBundle.putString("password", vPassword.getEditText()?.getText().toString())
                mBundle.putString("email", vEmail.getEditText()?.getText().toString())
                mBundle.putString("bornDate", vBorndate.getEditText()?.getText().toString())
                mBundle.putString("phone", vPhone.getEditText()?.getText().toString())

                intent.putExtras(mBundle)
                startActivity(intent)
            }

        }
    }
}