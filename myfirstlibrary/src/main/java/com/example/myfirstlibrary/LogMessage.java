package com.example.myfirstlibrary;

import android.util.Log;

public class LogMessage {
    private static final String TAG = "LogMessage";

    public static void Project(String message){
        Log.d(TAG, message + "");
    }
}
