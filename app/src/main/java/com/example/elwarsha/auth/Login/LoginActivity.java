package com.example.elwarsha.auth.Login;

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
import com.example.elwarsha.auth.SignUp.SignUpActivity;
import com.example.elwarsha.auth.UserData.UserData;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    UserData mUserData;
    EditText mEPass,mEEmail,mForget;
    Button mLogin,mSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUserData = new UserData(LoginActivity.this);
        initView();
    }

    private void initView() {
        mEPass = findViewById(R.id.Pass) ;
        mForget = findViewById(R.id.Forget);
        mEEmail = findViewById(R.id.Email);
        mLogin = findViewById(R.id.loginbtn);
        mSignup = findViewById(R.id.signUpButn);
        mSignup.setOnClickListener(this);
        mLogin.setOnClickListener(this);
        mForget.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginbtn:
//                if (ValidateData())


                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                break;
            case  R.id.signUpButn:
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
                break;
            case  R.id.Forget:
                startActivity(new Intent(LoginActivity.this, ForgetPassActivity.class));
                break;
        }
    }
//    boolean ValidateData() {
//
//        mEPass.getEditableText().toString().trim();
//        String nourhan =mEEmail.getEditableText().toString().trim();
//
//        if (mEEmail.getText().toString().isEmpty()) {
//            Toast.makeText(LoginActivity.this, "inter your email", Toast.LENGTH_LONG).show();
//            return false;
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(nourhan).matches()) {
//            Toast.makeText(LoginActivity.this,
//                    "please inter Email Valid", Toast.LENGTH_LONG).show();
//            return false;
//        } else if (mEPass.getText().toString().isEmpty()) {
//            Toast.makeText(LoginActivity.this, "inter your password", Toast.LENGTH_LONG).show();
//            return false;
//        } else if (mEPass.length() < 8) {
//
//            Toast.makeText(LoginActivity.this,
//                    "your password is week", Toast.LENGTH_LONG).show();
//            return false;
//        } else {
//            return true;
//        }
//    }



}
