package com.elaine.testpattern.prototype;

import android.util.Log;

/**
 * 白色
 * author: elaine
 * date: 2021/4/30
 */
public class WhiteColor extends Color {

    public WhiteColor() {
        type = "white";
    }

    @Override
    void fill() {
        Log.e("color====", "fill=====white");
    }
}
