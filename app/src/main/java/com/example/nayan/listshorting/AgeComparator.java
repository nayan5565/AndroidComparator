package com.example.nayan.listshorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Model> {
    @Override

    public int compare(Model o1, Model o2) {

        // descending order (ascending order would be:

        // o1.getGrade()-o2.getGrade())

        return o2.getAge() - o1.getAge();

    }

}

