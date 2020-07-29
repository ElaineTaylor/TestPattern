package com.elaine.testpattern.factory;

/**
 * @author elaine
 * @date 2020/7/28
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
