package com.liakhovskyi.serialization;

import java.lang.reflect.Field;

public class Converting {

    public static StringBuilder convertToJson(Group group) {
        StringBuilder resultJson = new StringBuilder();

        resultJson.append("{\n");
        addTabs(1, resultJson);
        resultJson.append("\"groups\": [");

        for(Group g : group.getGroups()) {
            resultJson.append("\n");
            addTabs(2, resultJson);
            resultJson.append("{\n");
            addTabs(3, resultJson);
            resultJson.append("\"figures\": [");

            for (Figure figure : g.getFigures()) {

                /*Field[] fields = figure.getClass().getDeclaredFields();
                    for (Field f : fields) {
                        resultJson.append("{\n\t\"" + f.getName() + "\": " + f.get(figure).toString() + "\""  + "\"\n},\n");
                }*/

                resultJson.append("\n");
                addTabs(4, resultJson);
                resultJson.append("{\n");
                addTabs(5, resultJson);
                resultJson.append("\"name\": \"" + figure.getNAME() + "\",\n");

                addTabs(5, resultJson);
                if (figure.getNAME().equals("Circle")) {
                    resultJson.append("\"circumference\": \"" + figure.calculatePerimeter() + "\",\n");
                } else {
                    resultJson.append("\"perimeter\": \"" + figure.calculatePerimeter() + "\",\n");
                }

                addTabs(5, resultJson);
                resultJson.append("\"area\": \"" + figure.calculateArea() + "\"\n");

                addTabs(4, resultJson);
                resultJson.append("},");
            }
            resultJson.append("\b\n");
            addTabs(3, resultJson);
            resultJson.append("]");

            resultJson.append("\n");
            addTabs(2, resultJson);
            resultJson.append("},");
        }
        resultJson.append("\b\n");
        addTabs(1, resultJson);
        resultJson.append("]");
        resultJson.append("\n}");

        return resultJson;
    }

    public static StringBuilder convertToXml(Group group) {
        StringBuilder resultXml = new StringBuilder();
        resultXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
        resultXml.append("<group>\n");
        for(Group g : group.getGroups()) {
            addTabs(1, resultXml);
            resultXml.append("<group>\n");
            for (Figure figure : g.getFigures()) {
                addTabs(2, resultXml);
                resultXml.append("<figure>\n");

                addTabs(3, resultXml);
                resultXml.append("<name>");
                resultXml.append(figure.getNAME());
                resultXml.append("</name>\n");

                addTabs(3, resultXml);
                if (figure.getNAME().equals("Circle")) {
                    resultXml.append("<circumference>");
                    resultXml.append(figure.calculatePerimeter());
                    resultXml.append("</circumference>\n");
                } else {
                    resultXml.append("<perimeter>");
                    resultXml.append(figure.calculatePerimeter());
                    resultXml.append("</perimeter>\n");
                }

                addTabs(3, resultXml);
                resultXml.append("<area>");
                resultXml.append(figure.calculateArea());
                resultXml.append("</area>\n");

                addTabs(2, resultXml);
                resultXml.append("</figure>\n");
            }
            addTabs(1, resultXml);
            resultXml.append("</group>\n");
        }
        resultXml.append("</group>");

        return resultXml;
    }

    private static void addTabs(int tabs, StringBuilder builder) {
        for (int i = 0; i < tabs; i++) {
            builder.append("\t");
        }
    }
}
