package com.elaine.testpattern.simplefactory;

/**
 * 正方形
 *
 * @author elaine
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
