package com.liakhovskyi.serialization;

public class Circle implements Figure {

    private float radius;
    private String color;
    private final String NAME = "Circle";

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getNAME() {
        return NAME;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * 3.14f * radius;
    }

    @Override
    public float calculateArea() {
        return (float)(3.14f * Math.pow(radius,2));
    }
}
