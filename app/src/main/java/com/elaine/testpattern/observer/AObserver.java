package com.elaine.testpattern.observer;

import android.util.Log;

/**
 * A观察者
 * author: elaine
 * date: 2021/4/21
 */
public class AObserver extends Observer {

    public AObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void updateData() {
        Log.e("data===更新了数据", "A data==" + subject.getData());
    }
}
