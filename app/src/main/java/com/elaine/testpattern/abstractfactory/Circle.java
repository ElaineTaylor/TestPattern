package com.elaine.testpattern.abstractfactory;

/**
 * 圆形
 *
 * @author elaine
 * @date 2020/7/27
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
