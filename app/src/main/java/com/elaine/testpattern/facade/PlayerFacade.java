package com.elaine.testpattern.facade;

/**
 * 统一的接口
 *
 * author: elaine
 * date: 2021/4/27
 */
public class PlayerFacade {
    private final BallPlayer ballPlayer;
    private final ChessPlayer chessPlayer;
    private final ViolinPlayer violinPlayer;

    public PlayerFacade() {
        ballPlayer = new BallPlayer();
        chessPlayer = new ChessPlayer();
        violinPlayer = new ViolinPlayer();
    }

    public void play() {
        ballPlayer.play();
        chessPlayer.play();
        violinPlayer.play();
    }
}
