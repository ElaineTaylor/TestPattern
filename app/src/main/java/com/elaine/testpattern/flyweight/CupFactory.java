package com.elaine.testpattern.flyweight;

import android.util.Log;

import java.util.HashMap;

/**
 * 容器管理
 * author: elaine
 * date: 2021/4/26
 */
public class CupFactory {
    //hashMap存储对象
    private static final HashMap<Integer, Cup> containerHashMap = new HashMap<>();

    public static Cup getCup(int capacity) {
        //获取hashMap中是否有对象，若无则创建，若有则直接放回对象
        Cup cup = containerHashMap.get(capacity);
        if (cup == null) {
            cup = new Cup(capacity);
            containerHashMap.put(capacity, cup);
            Log.e("建立新的实体对象--杯子", capacity + "毫升");
        }
        return cup;
    }
}
