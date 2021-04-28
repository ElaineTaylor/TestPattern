package com.elaine.testpattern.template;

/**
 * 运动
 * author: elaine
 * date: 2021/4/28
 */
public abstract class Sport {
    //热身
    protected abstract void ready();

    //开始
    protected abstract void start();

    //运动
    protected abstract void exercising();

    //结束
    protected abstract void end();

    //休息
    protected abstract void rest();

    //锻炼
    public final void exercise() {
        ready();
        start();
        exercising();
        end();
        rest();
    }
}
