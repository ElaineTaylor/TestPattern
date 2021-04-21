package com.elaine.testpattern.observer;

import android.util.Log;

/**
 * B观察者
 * author: elaine
 * date: 2021/4/21
 */
public class BObserver extends Observer {

    public BObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void updateData() {
        Log.e("data===新了数据", "B data==" + subject.getData());
    }
}
