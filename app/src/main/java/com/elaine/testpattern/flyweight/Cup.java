package com.elaine.testpattern.flyweight;

/**
 * 杯子对象
 * author: elaine
 * date: 2021/4/26
 */
public class Cup {
    private int capacity;
    private String color;
    private String shape;

    /**
     * 构造函数
     *
     * @param capacity 容量
     */
    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "capacity='" + capacity + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
