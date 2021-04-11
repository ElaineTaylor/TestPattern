package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 枚举类型
 * 1）天然不支持反射创建对应的实例，且有自己的反序列化机制
 * 2）利用类加载机制保证线程安全
 */
public enum EnumSingleton {
    INSTANCE;

    //对外方法，用于测试，功能是打印数据
    public void showMessage() {
        System.out.println("Hello EnumSingleton!");
    }
}
