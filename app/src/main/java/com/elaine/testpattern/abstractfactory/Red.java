package com.elaine.testpattern.abstractfactory;

/**
 * 红色
 *
 * @author elaine
 * @date 2020/7/27
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
