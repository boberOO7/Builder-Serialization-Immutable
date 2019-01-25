package com.liakhovskyi.serialization;

public class Triangle implements Figure {

    private final int NUMBER_OF_SIDES = 3;
    private float lengthOfSide;
    private String color;
    private final String NAME = "Triangle";

    public Triangle(float lengthOfSide, String color) {
        this.lengthOfSide = lengthOfSide;
        this.color = color;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    public float getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public int getNUMBER_OF_SIDES() {
        return NUMBER_OF_SIDES;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public float calculatePerimeter() {
        return lengthOfSide * NUMBER_OF_SIDES;
    }

    @Override
    public float calculateArea() {
        return (float)((Math.pow(lengthOfSide, 2) * Math.sqrt(3)) / 4);
    }
}
