package com.soft.system.area.sorter;

import java.util.ArrayList;
import java.util.List;

public class AppRunner {

    public static void main(String[] args) {
        AreaSorter sorter = new AreaSorter();
        List<Figure> figureList = new ArrayList<>();
        List<Figure> sortedList = new ArrayList<>();
        sortedList = sorter.sortAreas(figureList);
        System.out.println(sortedList);
    }
}
