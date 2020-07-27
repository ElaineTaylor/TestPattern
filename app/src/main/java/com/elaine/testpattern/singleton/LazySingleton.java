package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * 懒汉模式
 */
public class LazySingleton {
    private volatile static LazySingleton instance;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
