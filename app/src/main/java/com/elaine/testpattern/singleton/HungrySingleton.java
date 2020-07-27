package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 饿汉模式
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
