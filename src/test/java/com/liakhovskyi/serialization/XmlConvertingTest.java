package com.liakhovskyi.serialization;

import org.junit.Before;
import org.junit.Test;

import static com.liakhovskyi.serialization.XmlConverting.convertToXml;
import static org.junit.Assert.*;

public class XmlConvertingTest {
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
    public void testJsonConvertingReturnProperFormattedJson(){
        String expectedResult = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<group>\n" +
                "\t<group>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Circle</name>\n" +
                "\t\t\t<circumference>9.424778</circumference>\n" +
                "\t\t\t<area>7.0685835</area>\n" +
                "\t\t</figure>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Triangle</name>\n" +
                "\t\t\t<perimeter>6.0</perimeter>\n" +
                "\t\t\t<area>1.7320508</area>\n" +
                "\t\t</figure>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Circle</name>\n" +
                "\t\t\t<circumference>6.911504</circumference>\n" +
                "\t\t\t<area>3.8013272</area>\n" +
                "\t\t</figure>\n" +
                "\t</group>\n" +
                "\t<group>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Square</name>\n" +
                "\t\t\t<perimeter>10.4</perimeter>\n" +
                "\t\t\t<area>6.7599993</area>\n" +
                "\t\t</figure>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Circle</name>\n" +
                "\t\t\t<circumference>28.274334</circumference>\n" +
                "\t\t\t<area>63.617252</area>\n" +
                "\t\t</figure>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Square</name>\n" +
                "\t\t\t<perimeter>2.0</perimeter>\n" +
                "\t\t\t<area>0.25</area>\n" +
                "\t\t</figure>\n" +
                "\t</group>\n" +
                "\t<group>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Triangle</name>\n" +
                "\t\t\t<perimeter>32.25</perimeter>\n" +
                "\t\t\t<area>50.04003</area>\n" +
                "\t\t</figure>\n" +
                "\t\t<figure>\n" +
                "\t\t\t<name>Triangle</name>\n" +
                "\t\t\t<perimeter>11.1</perimeter>\n" +
                "\t\t\t<area>5.927944</area>\n" +
                "\t\t</figure>\n" +
                "\t</group>\n" +
                "</group>";
        String actualResult = convertToXml(mainGroup);
        assertEquals(expectedResult, actualResult);
    }

}