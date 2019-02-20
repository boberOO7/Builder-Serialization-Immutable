package com.liakhovskyi.serialization;

public class Square implements Figure {

    private final int numberOfSide = 4;
    private float lengthOfSide;
    private String color;
    private final String name = "Square";

    public Square(float lengthOfSide, String color) {
        this.lengthOfSide = lengthOfSide;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getNumberOfSide() {
        return numberOfSide;
    }

    public float getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
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
        return (float)Math.pow(lengthOfSide,2);
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
