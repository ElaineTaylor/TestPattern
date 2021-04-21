package com.elaine.testpattern.observer;

/**
 * 观察者抽象方法
 *
 * author: elaine
 * date: 2021/4/21
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void updateData();
}
