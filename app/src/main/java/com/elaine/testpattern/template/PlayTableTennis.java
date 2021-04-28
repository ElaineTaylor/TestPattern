package com.elaine.testpattern.template;

import android.util.Log;

/**
 * 打乒乓球
 * author: elaine
 * date: 2021/4/28
 */
public class PlayTableTennis extends Sport {

    @Override
    protected void ready() {
        Log.e("运动===", "热身");
    }

    @Override
    protected void start() {
        Log.e("运动===", "乒乓球开始运动");
    }

    @Override
    protected void exercising() {
        Log.e("运动===", "乒乓球运动中");
    }

    @Override
    protected void end() {
        Log.e("运动===", "乒乓球结束运动");
    }

    @Override
    protected void rest() {
        Log.e("运动===", "打球结束休息");
    }
}
