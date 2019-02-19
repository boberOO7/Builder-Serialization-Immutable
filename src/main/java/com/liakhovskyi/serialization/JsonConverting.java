package com.liakhovskyi.serialization;

public class JsonConverting {

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

                resultJson.append("\n");
                addTabs(4, resultJson);
                resultJson.append("{\n");
                addTabs(5, resultJson);
                resultJson.append("\"name\": \"" + figure.getName() + "\",\n");

                addTabs(5, resultJson);
                resultJson.append(figure.getPerimeterJson());

                addTabs(5, resultJson);
                resultJson.append(figure.getAreaJson());

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

    private static void addTabs(int tabs, StringBuilder builder) {
        for (int i = 0; i < tabs; i++) {
            builder.append("\t");
        }
    }
}
