package com.liakhovskyi.serialization;

import static com.liakhovskyi.serialization.Converting.*;

public class Main {
    public static void main(String[] args) {
        Group mainGroup = new Group();
        Group firstGroup = new Group();
        Group secondGroup = new Group();
        Group thirdGroup = new Group();

        firstGroup.addFigure(new Circle(1.5f,"red"));
        firstGroup.addFigure(new Triangle(2, "green"));
        firstGroup.addFigure(new Circle(1.1f, "white"));

        secondGroup.addFigure(new Square(2.6f, "black"));
        secondGroup.addFigure(new Circle(4.5f, "blue"));
        secondGroup.addFigure(new Square(0.5f, "grey"));

        thirdGroup.addFigure(new Triangle(10.75f, "brown"));
        thirdGroup.addFigure(new Triangle(3.7f, "yellow"));


        mainGroup.addGroup(firstGroup);
        mainGroup.addGroup(secondGroup);
        mainGroup.addGroup(thirdGroup);

        System.out.println(convertToJson(mainGroup));
    }
}
