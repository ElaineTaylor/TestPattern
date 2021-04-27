package com.elaine.testpattern.facade;

import android.util.Log;

/**
 * 小提琴演奏家
 * author: elaine
 * date: 2021/4/27
 */
public class ViolinPlayer implements Player {
    @Override
    public void play() {
        Log.e("player", "ViolinPlayer====play violin");
    }
}
