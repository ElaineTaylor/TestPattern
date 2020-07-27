package com.elaine.testpattern.abstractfactory;

/**
 * @author elaine
 * @date 2020/7/27
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
