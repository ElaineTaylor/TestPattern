package com.elaine.testpattern.factory;

/**
 * @author elaine
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
