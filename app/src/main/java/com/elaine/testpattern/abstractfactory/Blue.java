package com.elaine.testpattern.abstractfactory;

/**
 * 蓝色
 *
 * @author elaine
 * @date 2020/7/27
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
