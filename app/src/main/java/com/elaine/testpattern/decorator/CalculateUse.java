package com.elaine.testpattern.decorator;

import android.util.Log;

/**
 * 计算功能
 * <p>
 * author: elaine
 * date: 2021/4/23
 */
public class CalculateUse extends UseDecorator {
    public CalculateUse(PhoneUse phoneUse) {
        super(phoneUse);
    }

    @Override
    public void use() {
        Log.e("use===", "计算");
        phoneUse.use();
    }
}
