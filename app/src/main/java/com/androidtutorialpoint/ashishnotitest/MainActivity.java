package com.androidtutorialpoint.ashishnotitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidtutorialpoint.ashishnotitest.preference.SharedPreferencesManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyAndroidFCMIIDService";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAndroidFirebaseInstanceIdService service =new MyAndroidFirebaseInstanceIdService(getApplicationContext());
        service.methodToken();
        if(!SharedPreferencesManager.getDeviceToken(getApplicationContext()).equals("")&&SharedPreferencesManager.getDeviceToken(getApplicationContext())!=null){
              Log.e("ashish", SharedPreferencesManager.getDeviceToken(getApplicationContext()));
        }

    }
}
