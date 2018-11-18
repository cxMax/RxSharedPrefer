package com.cxmax.rxsharedprefer.sharedprefer;

import android.os.Looper;

/**
 * @describe :
 * @usage :
 * <p>
 * <p>
 * Created by cxmax on 2018/11/18.
 */
public class AppUtil {

    public static boolean isInBackgroundThread() {
        return Looper.getMainLooper() != Looper.myLooper();
    }
}
