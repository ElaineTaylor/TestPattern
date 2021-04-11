package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 饿汉模式
 */
public class HungrySingleton {
    //实例化
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    //返回对象
    public static HungrySingleton getInstance() {
        return instance;
    }

    //对外方法，用于测试，功能是打印数据
    public void showMessage() {
        System.out.println("Hello HungrySingleton!");
    }
}
