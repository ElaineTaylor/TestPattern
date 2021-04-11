package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * 懒汉模式
 * 1）线程安全问题
 * 2）double check 加锁优化
 * 3）编译器(JIT),CPU 有可能对指令进行重排序，导致使用到尚未初始化 的实例，
 * 可以通过添加volatile 关键字进行修饰， 对于volatile 修饰的字段，可以防止指令重排。
 */
public class LazySingleton {
    private volatile static LazySingleton instance;

    //构建方法
    public LazySingleton() {
    }

    //1.判断instance是否为空
    //2.synchronized加锁
    //3.若instance为空，则创建对象
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

    //对外方法，用于测试，功能是打印数据
    public void showMessage() {
        System.out.println("Hello LazySingleton!");
    }
}
