package com.jarvislin.camerawithpreview;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Jarvis Lin on 2015/5/4.
 */
public class Util {

    /** Check if this device has a camera */
    public static boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }
}
