package com.qefee.pj.ebase;

import android.app.Application;

/**
 * EBaseApp.
 * <ul>
 * <li>date: 16/9/11</li>
 * </ul>
 *
 * @author tongjin
 */
public class EBaseApp extends Application {

    private static EBaseApp singleton;

    public static EBaseApp getInstance() {
        return singleton;
    }

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();

        singleton = this;
    }
}
