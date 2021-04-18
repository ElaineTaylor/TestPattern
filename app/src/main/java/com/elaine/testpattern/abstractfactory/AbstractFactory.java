package com.elaine.testpattern.abstractfactory;

/**
 * 抽象工厂
 *
 * @author elaine
 * @date 2020/7/27
 */
public abstract class AbstractFactory {
    /**
     * 获取颜色
     *
     * @param color 颜色
     * @return Color
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     *
     * @param shape 形状
     * @return Shape
     */
    public abstract Shape getShape(String shape);
}
