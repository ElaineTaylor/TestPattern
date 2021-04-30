package com.elaine.testpattern.prototype;

import android.util.Log;

/**
 * 绿色
 * author: elaine
 * date: 2021/4/30
 */
public class GreenColor extends Color {

    public GreenColor() {
        type = "green";
    }

    @Override
    void fill() {
        Log.e("color====", "fill=====green");
    }
}
