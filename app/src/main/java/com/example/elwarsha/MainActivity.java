package com.example.elwarsha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.elwarsha.Home.HomeActivity;
import com.example.elwarsha.auth.SignUp.SignUpActivity;
import com.example.elwarsha.auth.UserData.UserData;

public class MainActivity extends AppCompatActivity {
    UserData mUserData;
    ImageView mGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserData = new UserData(MainActivity.this);
        mGif=findViewById(R.id.imag_view);
        initViews();
        splashTimer();
    }

    private void initViews() {
        mGif=findViewById(R.id.imag_view);
        Glide.with(MainActivity.this).load(R.raw.giphy).into(mGif);
    }

    private void splashTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (mUserData.isLogin()) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                } else {
                    startActivity(new Intent(MainActivity.this, SignUpActivity.class));
                }
            }
        },8000);

    }

}
