package com.elaine.testpattern.factory;

/**
 * @author elaine
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
