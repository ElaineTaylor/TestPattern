package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 静态内部类
 */
public class InnerClassSingleton {
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
