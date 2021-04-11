package com.elaine.testpattern.simplefactory;

/**
 * 长方形
 *
 * @author elaine
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
