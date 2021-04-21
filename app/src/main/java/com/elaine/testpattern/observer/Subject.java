package com.elaine.testpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * <p>
 * author: elaine
 * date: 2021/4/21
 */
public class Subject {
    private final List<Observer> observerList = new ArrayList<>();
    private int data;

    public int getData() {
        return data;
    }

    /**
     * 设置数据，且通知观察者更新数据
     *
     * @param data 数据
     */
    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }

    /**
     * 添加观察者到列表
     *
     * @param observer 观察者
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 循环通知观察者更新数据
     */
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.updateData();
        }
    }
}
