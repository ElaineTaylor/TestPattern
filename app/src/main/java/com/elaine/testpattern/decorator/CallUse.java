package com.elaine.testpattern.decorator;

import android.util.Log;

/**
 * 手机基础功能---打电话
 * author: elaine
 * date: 2021/4/23
 */
public class CallUse implements PhoneUse {
    @Override
    public void use() {
        Log.e("use====", "打电话");
    }
}
