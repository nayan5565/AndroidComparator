package com.example.nayan.listshorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Model> {

    @Override

    public int compare(Model o1, Model o2) {

        String name1 = o1.getName();

        String name2 = o2.getName();



        // ascending order (descending order would be: name2.compareTo(name1))

        return name1.compareTo(name2);

    }
}

