package com.androidtutorialpoint.ashishnotitest;


import android.content.Context;
import android.util.Log;

import com.androidtutorialpoint.ashishnotitest.preference.SharedPreferencesManager;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyAndroidFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "MyAndroidFCMIIDService";
    private final Context context;

    public MyAndroidFirebaseInstanceIdService(Context context) {
        this.context = context;
    }


    @Override
    public void onTokenRefresh() {

        //Get hold of the registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

//        SharedPreferencesManager.setDeviceToken(getApplicationContext(),refreshedToken);
        //Log the token
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        sendRegistrationToServer(refreshedToken);


    }

    private void sendRegistrationToServer(String token) {
        Log.e("token1",token);
        SharedPreferencesManager.setDeviceToken(context,token);


        //Implement this method if you want to store the token on your server

    }

    public void  methodToken(){

        MyAndroidFirebaseInstanceIdService  service  = new MyAndroidFirebaseInstanceIdService(context);
        service.onTokenRefresh();
    }
}