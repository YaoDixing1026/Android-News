package com.and.common;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextHolder.setContext(this);
    }
    public static class ContextHolder{
        @SuppressLint("StaticFieldLeak")
        private static Context context;

        public static Context getContext() {
            return context;
        }

        private static void setContext(Context c) {
            context = c;
        }
    }
}
