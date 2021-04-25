package com.elaine.testpattern.adapter;

import android.util.Log;

/**
 * 网络电视
 * author: elaine
 * date: 2021/4/25
 */
public class OnlineTelevision implements AdvancedTelevision {
    @Override
    public void showOnline(String signalType) {
        Log.e("show====", "网络节目");
    }
}
