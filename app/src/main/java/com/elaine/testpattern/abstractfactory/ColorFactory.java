package com.elaine.testpattern.abstractfactory;

/**
 * 颜色工厂
 * 继承抽象工厂
 *
 * @author elaine
 * @date 2020/7/27
 */
public class ColorFactory extends AbstractFactory {
    /**
     * 根据传入的颜色，创建具体的颜色实体
     *
     * @param color 颜色
     * @return Color
     */
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
