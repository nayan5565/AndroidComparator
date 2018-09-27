package com.example.nayan.listshorting;

import android.provider.CallLog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Model> models;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        display();
        loadList(models);
        sortingDate();
    }

    private Date dateFormat(String date2) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = fmt.parse(date2);

        } catch (ParseException e) {
            e.printStackTrace();

        }

        return date;
    }

    private void createList() {


        models = new ArrayList<>();

        model = new Model();
        model.setAge(26);
        model.setName("Balam");
        model.setCreated(dateFormat("09-09-2018"));
        models.add(model);

        model = new Model();
        model.setAge(30);
        model.setName("Habib");
        model.setCreated(dateFormat("01-09-2018"));
        models.add(model);

        model = new Model();
        model.setAge(24);
        model.setName("Abbas");
        model.setCreated(dateFormat("22-09-2018"));
        models.add(model);

        model = new Model();
        model.setAge(33);
        model.setName("Galib");
        model.setCreated(dateFormat("12-09-2018"));
        models.add(model);

        model = new Model();
        model.setAge(32);
        model.setName("Dalim");
        model.setCreated(dateFormat("03-09-2018"));
        models.add(model);

        model = new Model();
        model.setAge(35);
        model.setName("Ekbal");
        model.setCreated(dateFormat("29-09-2018"));
        models.add(model);


    }

    private void sortingDate() {
        Collections.sort(models, new DateComparator());

        for (int i = 0; i < models.size(); i++) {
            Log.e("Date", " is : " + models.get(i).getCreated());
        }
    }

    private void display() {

        Collections.sort(models, new NameComparator());

        for (int i = 0; i < models.size(); i++) {
            Log.e("Name", " is : " + models.get(i).getName());
        }

    }

    public void loadList(ArrayList<Model> list) {
        List<Model> ages = new ArrayList<Model>();
        ages.addAll(list);

        // Ascending Order
        Collections.sort(ages, new Comparator<Model>() {

            @Override
            public int compare(Model o1, Model o2) {
                return (int) (o1.getAge() - o2.getAge());
            }
        });

        for (int i = 0; i < ages.size(); i++) {
            Log.e("Age2", " is : " + ages.get(i).getAge());
        }
        // Descending Order
//        Collections.sort(ages, new Comparator<Model>() {
//
//            @Override
//            public int compare(Model o1, Model o2) {
//                return (int) (o2.getAge() - o1.getAge());
//            }
//        });
    }
}
