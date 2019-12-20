package com.example.elwarsha.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.elwarsha.Items.itemsActivity;
import com.example.elwarsha.R;
import com.example.elwarsha.Settings.SettingScreen.SettingsActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView mopenDrawer;
    DrawerLayout mDrawer;
    TextView mTexthome,mTextFvorite,mTexthistory,mTextsettings,mTextAboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initatViews();
        loadFragment(new HomeFragment(),"Home");
    }

    private void initatViews() {
        mDrawer =findViewById(R.id.drawar);
        mopenDrawer=findViewById(R.id.open_Drawer);
        mTexthome=findViewById(R.id.texthome);
        mTextFvorite=findViewById(R.id.textFvorite);
        mTexthistory=findViewById(R.id.texthistory);
        mTextsettings=findViewById(R.id.textsettings);
        mTextAboutus=findViewById(R.id.textAboutus);


        mTexthome.setOnClickListener(this);
        mTextFvorite.setOnClickListener(this);
        mTexthistory.setOnClickListener(this);
        mTextAboutus.setOnClickListener(this);
        mTextsettings.setOnClickListener(this);
        mopenDrawer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.open_Drawer:
                mDrawer.openDrawer(Gravity.LEFT);
                break;

            case R.id.textFvorite:
        startActivity(new Intent(HomeActivity.this, itemsActivity.class));
                break;
            case R.id.textsettings:
                startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
                break;
//            case R.id.textFvorite:
//                startActivity(new Intent(HomeActivity.this, itemsActivity.class));
//
//            case R.id.textFvorite:
//                startActivity(new Intent(HomeActivity.this, itemsActivity.class));

        }

    }
    void loadFragment(Fragment fragment, String home){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.page_container,fragment).commit();
        mDrawer.closeDrawers();



    }
}
