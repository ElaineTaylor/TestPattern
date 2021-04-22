package com.elaine.testpattern.strategy;

import android.util.Log;

/**
 * 继承Play接口
 * 表示他能跳舞
 * <p>
 * author: elaine
 * date: 2021/4/22
 */
public class Draw implements Play {
    @Override
    public void doSomething() {
        Log.e("people====", "can draw.");
    }
}
