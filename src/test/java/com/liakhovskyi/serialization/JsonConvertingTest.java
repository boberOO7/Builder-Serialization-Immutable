package com.liakhovskyi.serialization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.liakhovskyi.serialization.JsonConverting.convertToJson;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class JsonConvertingTest {
    Group mainGroup = new Group();
    Group firstGroup = new Group();
    Group secondGroup = new Group();
    Group thirdGroup = new Group();

    @Before
    public void init() {
        firstGroup.addFigure(new Circle(1.5f, "red"));
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
    }

    @Test
    public void testJsonConvertingReturnProperFormattedJson() {
        String expectedResult = "{\n" +
                "\t\"groups\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"figures\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Circle\",\n" +
                "\t\t\t\t\t\"circumference\": \"9.424778\",\n" +
                "\t\t\t\t\t\"area\": \"7.0685835\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Triangle\",\n" +
                "\t\t\t\t\t\"perimeter\": \"6.0\",\n" +
                "\t\t\t\t\t\"area\": \"1.7320508\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Circle\",\n" +
                "\t\t\t\t\t\"circumference\": \"6.911504\",\n" +
                "\t\t\t\t\t\"area\": \"3.8013272\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"figures\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Square\",\n" +
                "\t\t\t\t\t\"perimeter\": \"10.4\",\n" +
                "\t\t\t\t\t\"area\": \"6.7599993\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Circle\",\n" +
                "\t\t\t\t\t\"circumference\": \"28.274334\",\n" +
                "\t\t\t\t\t\"area\": \"63.617252\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Square\",\n" +
                "\t\t\t\t\t\"perimeter\": \"2.0\",\n" +
                "\t\t\t\t\t\"area\": \"0.25\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"figures\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Triangle\",\n" +
                "\t\t\t\t\t\"perimeter\": \"32.25\",\n" +
                "\t\t\t\t\t\"area\": \"50.04003\"\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"name\": \"Triangle\",\n" +
                "\t\t\t\t\t\"perimeter\": \"11.1\",\n" +
                "\t\t\t\t\t\"area\": \"5.927944\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        String actualResult = convertToJson(mainGroup);
        assertEquals(expectedResult, actualResult);
    }
}
