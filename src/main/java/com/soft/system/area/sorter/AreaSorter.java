package com.soft.system.area.sorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AreaSorter{
    List<Figure> sortedList = new ArrayList<>();

    public List<Figure> sortAreas(List<Figure> figureList) {
        sortedList = figureList.sort(comparator);
        return sortedList;

    }


    Comparator<Figure> comparator = (b1, b2) -> b2.getField() - b1.getField();

    public double searchMaxField(List<Figure> figureList) {
        double field = 0;
        for(Figure figure : figureList) {
            if(figure.getField() > field) {
                field = figure.getField();
            }
        }
        return field;
    }

    public double searchMinField(List<Figure> figureList) {
        double field = 0;
        for(Figure figure : figureList) {
            if(figure.getField() < field) {
                field = figure.getField();
            }
        }
        return field;
    }
}
