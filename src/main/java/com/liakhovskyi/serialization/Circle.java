package com.liakhovskyi.serialization;

public class Circle implements Figure {

    private float radius;
    private String color;
    private final String name = "Circle";

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getName() {
        return name;
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
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public float calculateArea() {
        return (float)(Math.PI * Math.pow(radius,2));
    }

    @Override
    public String getPerimeterJson() {
        return "\"circumference\": \"" + calculatePerimeter() + "\",\n";
    }

    @Override
    public String getAreaJson() {
        return "\"area\": \"" + calculateArea() + "\"\n";
    }

    @Override
    public String getPerimeterXml() {
        return "<circumference>" + calculatePerimeter() + "</circumference>\n";
    }

    @Override
    public String getAreaXml() {
        return "<area>" + calculateArea() + "</area>\n";
    }
}
