package com.elaine.testpattern.prototype;

/**
 * 颜色抽象类
 * author: elaine
 * date: 2021/4/30
 */
public abstract class Color implements Cloneable {
    private int id;
    protected String type;

    abstract void fill();

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
