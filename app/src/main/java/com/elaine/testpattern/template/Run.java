package com.elaine.testpattern.template;

import android.util.Log;

/**
 * 跑步
 * author: elaine
 * date: 2021/4/28
 */
public class Run extends Sport {

    @Override
    protected void ready() {
        Log.e("运动===", "热身");
    }

    @Override
    protected void start() {
        Log.e("运动===", "跑步开始");
    }

    @Override
    protected void exercising() {
        Log.e("运动===", "跑步中");
    }

    @Override
    protected void end() {
        Log.e("运动===", "跑步结束");
    }

    @Override
    protected void rest() {
        Log.e("运动===", "跑步结束休息");
    }
}
