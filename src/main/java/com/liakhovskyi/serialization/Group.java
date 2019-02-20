package com.liakhovskyi.serialization;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Group> groups = new ArrayList<>();
    private List<Figure> figures = new ArrayList<>();

    public List<Group> getGroups() {
        return groups;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void removeGroup(Group group) {
        groups.remove(group);
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }
}
