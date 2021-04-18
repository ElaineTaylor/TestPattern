package com.elaine.testpattern.abstractfactory;

/**
 * 绿色
 *
 * @author elaine
 * @date 2020/7/27
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
