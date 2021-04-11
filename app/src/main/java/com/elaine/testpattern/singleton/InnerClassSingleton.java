package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 静态内部类
 * 1).本质上是利用类的加载机制来保证线程安全
 * 2).只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一 种形式。
 */
public class InnerClassSingleton {

    //内部的对象
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    //构建方法
    public InnerClassSingleton() {
    }

    //返回对象
    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    //对外方法，用于测试，功能是打印数据
    public void showMessage() {
        System.out.println("Hello InnerClassSingleton!");
    }
}
