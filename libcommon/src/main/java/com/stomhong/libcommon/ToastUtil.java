package com.stomhong.libcommon;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Toast mToast = null;

    public static void init(Context context){
        if (mToast == null){
            mToast = new Toast(context);
        }
    }
}
