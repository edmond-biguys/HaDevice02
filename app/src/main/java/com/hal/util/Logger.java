package com.hal.util;

import android.util.Log;

/**
 * Created by cjj on 16/10/22.
 */
public class Logger {

    public static void log_d(String tag, Object msg) {
        Log.d(tag, "log: " + msg);
    }

}
