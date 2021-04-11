package com.elaine.testpattern.simplefactory;

/**
 * 圆形
 *
 * @author elaine
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
