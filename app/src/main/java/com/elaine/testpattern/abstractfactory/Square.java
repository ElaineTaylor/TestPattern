package com.elaine.testpattern.abstractfactory;

/**
 * @author elaine
 * @date 2020/7/27
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
