package com.elaine.testpattern.strategy;

/**
 * 定义一个人
 *
 * author: elaine
 * date: 2021/4/22
 */
public class People {
    private Play play;

    public People(Play play) {
        this.play = play;
    }

    public void play(){
        play.doSomething();
    }
}
