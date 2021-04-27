package com.elaine.testpattern.facade;

import android.util.Log;

/**
 * 棋类爱好者
 * author: elaine
 * date: 2021/4/27
 */
public class ChessPlayer implements Player {
    @Override
    public void play() {
        Log.e("player", "ChessPlayer====play chess");
    }
}
