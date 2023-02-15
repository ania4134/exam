package com.soft.system.area.sorter;

public class Rectangle implements Figure {
    double size1;
    double size2;
    String name;
    double field = size1 * size2;

    public Rectangle(double size1, double size2, String name) {
        this.size1 = size1;
        this.size2 = size2;
        this.name = name;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getField() {
        return field;
    }

}
