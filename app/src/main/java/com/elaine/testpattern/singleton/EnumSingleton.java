package com.elaine.testpattern.singleton;

/**
 * @author elaine
 * @date 2020/7/27
 * <p>
 * 枚举类型
 */
public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello world!");
    }
}
