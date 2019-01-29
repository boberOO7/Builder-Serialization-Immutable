package com.liakhovskyi.serialization;

public class Triangle implements Figure {

    private final int numberOfSide = 3;
    private float lengthOfSide;
    private String color;
    private final String name = "Triangle";

    public Triangle(float lengthOfSide, String color) {
        this.lengthOfSide = lengthOfSide;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public float getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public int getNumberOfSide() {
        return numberOfSide;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public float calculatePerimeter() {
        return lengthOfSide * numberOfSide;
    }

    @Override
    public float calculateArea() {
        return (float)((Math.pow(lengthOfSide, 2) * Math.sqrt(3)) / 4);
    }

    @Override
    public String getPerimeterJson() {
        return "\"perimeter\": \"" + calculatePerimeter() + "\",\n";
    }

    @Override
    public String getAreaJson() {
        return "\"area\": \"" + calculateArea() + "\"\n";
    }

    @Override
    public String getPerimeterXml() {
        return "<perimeter>" + calculatePerimeter() + "</perimeter>\n";
    }

    @Override
    public String getAreaXml() {
        return "<area>" + calculateArea() + "</area>\n";
    }
}
