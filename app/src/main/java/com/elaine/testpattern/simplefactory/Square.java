package com.elaine.testpattern.simplefactory;

/**
 * @author elaine
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
