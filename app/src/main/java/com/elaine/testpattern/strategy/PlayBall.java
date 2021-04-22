package com.elaine.testpattern.strategy;

import android.util.Log;

/**
 * 继承Play接口
 * 表示他能打球
 *
 * author: elaine
 * date: 2021/4/22
 */
public class PlayBall implements Play {

    @Override
    public void doSomething() {
        Log.e("people====", "can play boll.");
    }
}
