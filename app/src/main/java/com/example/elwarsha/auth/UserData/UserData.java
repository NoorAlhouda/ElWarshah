package com.example.elwarsha.auth.UserData;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class UserData {
    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor MEditor;
    Context mContext;


    private static final String FILE_NAME = "El Warsha";
    private static final String KEY_PASS = "user_pass";
    private static final String KEY_EMAIL = "user_email";
    private static final String KEY_FIRST_NAME = "user_first_name";
    private static final String KEY_LAST_NAME = "user_last_name";
    private static final String KEY_PHONE = "user_phone";


    private static final String KEY_STATUS = "user_status";

    public UserData(Context mContext) {
        this.mContext = mContext;
        mSharedPreferences = mContext.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        MEditor= mSharedPreferences.edit();
    }
    public void saveData (String first_name ,String email,Boolean status,String pass,String last_name,String phone){
        MEditor.putString(KEY_PASS,pass);
        MEditor.putString(KEY_EMAIL,email);
        MEditor.putString(KEY_FIRST_NAME,first_name);
        MEditor.putString(KEY_PHONE,phone);
        MEditor.putString(KEY_LAST_NAME,last_name);
        MEditor.putBoolean(KEY_STATUS,status);
        MEditor.apply();
    }
    public HashMap<String,String> getUserData(){
        HashMap<String,String> user = new HashMap<>();
        user.put(KEY_PASS,mSharedPreferences.getString(KEY_PASS,null));
        user.put(KEY_EMAIL,mSharedPreferences.getString(KEY_EMAIL,null));
        user.put(KEY_FIRST_NAME,mSharedPreferences.getString(KEY_FIRST_NAME,null));
        user.put(KEY_LAST_NAME,mSharedPreferences.getString(KEY_LAST_NAME,null));
        user.put(KEY_PHONE,mSharedPreferences.getString(KEY_PHONE,null));

        return user;
    }
    public boolean isLogin(){
        return mSharedPreferences.getBoolean(KEY_STATUS,false);
    }

}
