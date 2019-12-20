package com.example.elwarsha.auth.SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.elwarsha.Home.HomeActivity;
import com.example.elwarsha.R;
import com.example.elwarsha.auth.ForgetPassword.ForgetPassActivity;
import com.example.elwarsha.auth.Login.LoginActivity;
import com.example.elwarsha.auth.UserData.UserData;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mEPass, mEEmail, mFName, mLName, mPhone,mForget;
    Button mLogin, mSignup;
    UserData mUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mUserData = new UserData(SignUpActivity.this);
        initViews();
    }

    private void initViews() {
        mFName = findViewById(R.id.first);
        mLName = findViewById(R.id.last);
        mPhone = findViewById(R.id.phone);
        mEEmail = findViewById(R.id.email);
        mEPass = findViewById(R.id.pass);
        mLogin = findViewById(R.id.login);
        mForget = findViewById(R.id.forget);
        mSignup = findViewById(R.id.signUpButn);
        mSignup.setOnClickListener(this);
        mForget.setOnClickListener(this);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signUpButn:
                if (ValidateData())


                    startActivity(new Intent(SignUpActivity.this, HomeActivity.class));
                break;
            case R.id.login:
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                break;
            case R.id.forget:
                startActivity(new Intent(SignUpActivity.this, ForgetPassActivity.class));
                break;
        }
    }
    boolean ValidateData() {
        mFName.getEditableText().toString().trim();
        mLName.getEditableText().toString().trim();
        String nourhan =    mEEmail.getEditableText().toString().trim();
        mPhone.getEditableText().toString().trim();
        mEPass.getEditableText().toString().trim();
        if (mFName.getText().toString().isEmpty()) {
            Toast.makeText(SignUpActivity.this, "inter your first name", Toast.LENGTH_LONG).show();
            return false;

        } else if (mLName.getText().toString().isEmpty()) {
            Toast.makeText(SignUpActivity.this, "inter your last name", Toast.LENGTH_LONG).show();
            return false;

        } else if (mEEmail.getText().toString().isEmpty()) {
            Toast.makeText(SignUpActivity.this, "inter your email", Toast.LENGTH_LONG).show();
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(nourhan).matches()) {
            Toast.makeText(SignUpActivity.this,
                    "please inter Email Valid", Toast.LENGTH_LONG).show();
            return false;

        } else if (mPhone.getText().toString().isEmpty()) {
            Toast.makeText(SignUpActivity.this, "inter your phone", Toast.LENGTH_LONG).show();
            return false;
        } else if (mPhone.length() < 11) {

            Toast.makeText(SignUpActivity.this,
                    "please inter Valid Number", Toast.LENGTH_LONG).show();
            return false;


        } else if (mEPass.getText().toString().isEmpty()) {
            Toast.makeText(SignUpActivity.this, "inter your pssword", Toast.LENGTH_LONG).show();
            return false;
        } else if (mEPass.length() < 8) {

            Toast.makeText(SignUpActivity.this,
                    "your password is week", Toast.LENGTH_LONG).show();
            return false;

        } else {
            return true;
        }


    }
}
