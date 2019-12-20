package com.example.elwarsha.Settings.EditeProfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.elwarsha.R;
import com.example.elwarsha.Settings.SettingScreen.SettingsActivity;

public class EditeProfilActivity extends AppCompatActivity implements View.OnClickListener{
ImageView mImageView;
Button mSaveButn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edite_profil);
        initViewss();
    }

    private void initViewss() {
        mImageView=findViewById(R.id.imageView);
        mSaveButn=findViewById(R.id.saveButn);


        mImageView.setOnClickListener(this);
        mSaveButn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                startActivity(new Intent(EditeProfilActivity.this, SettingsActivity.class));
                break;
            case R.id.saveButn:
                startActivity(new Intent(EditeProfilActivity.this, SettingsActivity.class));
                break;
        }
        }

}
