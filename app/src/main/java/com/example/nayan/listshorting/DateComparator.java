package com.example.nayan.listshorting;

import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<Model> {

    @Override

    public int compare(Model o1, Model o2) {

        Date date1 = o1.getCreated();

        Date date2 = o2.getCreated();



        // ascending order (descending order would be: date2.compareTo(date1))

        return date1.compareTo(date2);

    }
}
