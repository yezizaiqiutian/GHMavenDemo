package com.gh.lib_demo;

import android.content.Context;
import android.widget.Toast;

/**
 * @author: gh
 * @description:
 * @date: 4/25/21.
 * @from:
 */
public class DemoUtils {

    public static void toast(Context context, String toast) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

}
