package com.elaine.testpattern.abstractfactory;

/**
 * 形状工厂
 * 继承抽象工厂
 *
 * @author elaine
 * @date 2020/7/27
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 根据传入的形状，创建具体的形状对象
     *
     * @param shape 形状
     * @return Shape
     */
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
