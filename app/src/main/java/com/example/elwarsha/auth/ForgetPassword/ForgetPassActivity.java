package com.example.elwarsha.auth.ForgetPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.elwarsha.R;

public class ForgetPassActivity extends AppCompatActivity {
    EditText mEmailForget;
    Button mSendButn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
        initViews();

    }

    private void initViews() {
        mEmailForget = findViewById(R.id.EmailForget);
        mSendButn = findViewById(R.id.sendButn);

        mSendButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEmailForget.getText().toString().isEmpty()) {
                    Toast.makeText(ForgetPassActivity.this, "inter your email", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(ForgetPassActivity.this, "YOUR PASSWORD IS ", Toast.LENGTH_LONG).show();

                }
            }


        });





}
}
