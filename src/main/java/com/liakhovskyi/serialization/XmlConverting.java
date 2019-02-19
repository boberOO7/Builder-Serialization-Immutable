package com.liakhovskyi.serialization;

public class XmlConverting {

    public static String convertToXml(Group group) {
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
                resultXml.append(figure.getName());
                resultXml.append("</name>\n");

                addTabs(3, resultXml);
                resultXml.append(figure.getPerimeterXml());

                addTabs(3, resultXml);
                resultXml.append(figure.getAreaXml());

                addTabs(2, resultXml);
                resultXml.append("</figure>\n");
            }
            addTabs(1, resultXml);
            resultXml.append("</group>\n");
        }
        resultXml.append("</group>");

        return resultXml.toString();
    }

    private static void addTabs(int tabs, StringBuilder builder) {
        for (int i = 0; i < tabs; i++) {
            builder.append("\t");
        }
    }
}
