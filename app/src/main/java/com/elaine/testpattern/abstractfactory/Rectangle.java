package com.elaine.testpattern.abstractfactory;

/**
 * 长方形
 *
 * @author elaine
 * @date 2020/7/27
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
