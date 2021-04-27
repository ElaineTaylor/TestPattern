package com.elaine.testpattern.facade;

import android.util.Log;

/**
 * 球类运动员
 *
 * author: elaine
 * date: 2021/4/27
 */
public class BallPlayer implements Player{
    @Override
    public void play() {
        Log.e("player", "BallPlayer====play ball");
    }
}
