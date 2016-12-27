package com.androidtutorialpoint.ashishnotitest.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private SharedPreferencesManager() {
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("APP_SETTINGS", Context.MODE_PRIVATE);
    }



    public static String getDeviceToken(Context context) {
        return getSharedPreferences(context).getString("DeviceToken", null);
    }

    public static void setDeviceToken(Context context, String friendID) {
        final SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString("DeviceToken", friendID);
        editor.commit();
    }


}
