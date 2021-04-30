package com.elaine.testpattern.prototype;

import android.util.Log;

/**
 * 红色
 * author: elaine
 * date: 2021/4/30
 */
public class RedColor extends Color {

    public RedColor() {
        type = "red";
    }

    @Override
    void fill() {
        Log.e("color====", "fill=====red");
    }
}
