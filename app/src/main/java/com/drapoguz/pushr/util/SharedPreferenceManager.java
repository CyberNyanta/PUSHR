package com.drapoguz.pushr.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

public class SharedPreferenceManager {

    // Data Members
    private SharedPreferences mSharedPreferences;


    // Constructors
    public SharedPreferenceManager(@NonNull Context context) {

        mSharedPreferences = context.getSharedPreferences("com.drapoguz.pushr", Context.MODE_PRIVATE);
    }


    // Put Methods
    public void putBoolean(String key, boolean value) {

        mSharedPreferences.edit().putBoolean(key, value).apply();
    }

    public void putInteger(String key, int value) {

        mSharedPreferences.edit().putInt(key, value).apply();
    }

    public void putFloat(String key, float value) {

        mSharedPreferences.edit().putFloat(key, value).apply();
    }

    public void putLong(String key, long value) {

        mSharedPreferences.edit().putLong(key, value).apply();
    }

    public void putString(String key, String value) {

        mSharedPreferences.edit().putString(key, value).apply();
    }

    // Get Methods
    public boolean getBoolean(String key, boolean defaultValue) {

        return mSharedPreferences.getBoolean(key, defaultValue);
    }

    public int getInt(String key, int defaultValue) {

        return mSharedPreferences.getInt(key, defaultValue);
    }

    public float getFloat(String key, float defaultValue) {

        return mSharedPreferences.getFloat(key, defaultValue);
    }

    public float getLong(String key, long defaultValue) {

        return mSharedPreferences.getLong(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {

        return mSharedPreferences.getString(key, defaultValue);
    }

    // Clear Methods
    public void clearAll() {

        mSharedPreferences.edit().clear().apply();
    }
}
