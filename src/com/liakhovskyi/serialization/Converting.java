package com.liakhovskyi.serialization;

public class Converting {

    public static StringBuilder convertToJson(Group group) {
        StringBuilder resultJson = new StringBuilder();

        /*Class clazz = figure.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            resultJson.append("{\n\t\"" + f.getName() + "\": " + "\""  + "\"\n},\n");
        }*/
        resultJson.append("{");
        resultJson.append("\n\t\"groups\": [");

        for(Group g : group.getGroups()) {
            resultJson.append("\n\t\t{");
            resultJson.append("\n\t\t\t\"figures\": [");

            for (Figure figure : g.getFigures()) {
                resultJson.append("\n\t\t\t\t{");
                resultJson.append("\n\t\t\t\t\t\"name\": \"" + figure.getNAME() + "\",");
                if (figure.getNAME().equals("Circle")) {
                    resultJson.append("\n\t\t\t\t\t\"circumference\": \"" + figure.calculatePerimeter() + "\",");
                } else {
                    resultJson.append("\n\t\t\t\t\t\"perimeter\": \"" + figure.calculatePerimeter() + "\",");
                }
                resultJson.append("\n\t\t\t\t\t\"area\": \"" + figure.calculateArea() + "\",");
                resultJson.append("\b\n\t\t\t\t},");
            }
            resultJson.append("\b\n\t\t\t]");
            resultJson.append("\n\t\t},");
        }
        resultJson.append("\b\n\t]");
        resultJson.append("\n}");
        return resultJson;
    }
}
