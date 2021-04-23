package com.elaine.testpattern.decorator;

import android.util.Log;

/**
 * 拍照功能
 * author: elaine
 * date: 2021/4/23
 */
public class PhotographUse extends UseDecorator {
    public PhotographUse(PhoneUse phoneUse) {
        super(phoneUse);
    }

    @Override
    public void use() {
        Log.e("use===", "拍照");
        phoneUse.use();
    }
}
