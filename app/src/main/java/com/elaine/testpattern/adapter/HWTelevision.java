package com.elaine.testpattern.adapter;

import android.util.Log;

/**
 * HW电视
 * 既可以放数字电视，也可以放网络电视
 *
 * author: elaine
 * date: 2021/4/25
 */
public class HWTelevision implements Television {
    private TelevisionAdapter televisionAdapter;

    @Override
    public void showDigital(String signalType) {
        if (signalType.equalsIgnoreCase("digital")) {
            Log.e("show====", "digital tv");
        } else if (signalType.equalsIgnoreCase("online")) {
            televisionAdapter = new TelevisionAdapter(signalType);
            televisionAdapter.showDigital(signalType);
        } else {
            Log.e("show===", "此信号无法接收");
        }

    }
}
