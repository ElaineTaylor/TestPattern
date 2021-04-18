package com.elaine.testpattern.abstractfactory;

/**
 * 工厂生产类
 *
 * @author elaine
 * @date 2020/7/27
 */
public class FactoryProducer {
    /**
     * 根据传入的选择，实现具体的工厂
     *
     * @param choice 类型
     * @return 具体的工厂
     */
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
