package com.soft.system.area.sorter;

public class Circle implements Figure {
    double radius;
    String name;
    double field = Math.PI * Math.pow(radius, 2);

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
