package com.example.nayan.listshorting;

import android.provider.CallLog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
    }

    private void createList() {
        models = new ArrayList<>();

        model = new Model();
        model.setAge(26);
        model.setName("Balam");
        model.setCreated(new Date());
        models.add(model);

        model = new Model();
        model.setAge(30);
        model.setName("Habib");
        model.setCreated(new Date());
        models.add(model);

        model = new Model();
        model.setAge(24);
        model.setName("Abbas");
        model.setCreated(new Date());
        models.add(model);

        model = new Model();
        model.setAge(33);
        model.setName("Galib");
        model.setCreated(new Date());
        models.add(model);

        model = new Model();
        model.setAge(32);
        model.setName("Dalim");
        model.setCreated(new Date());
        models.add(model);

        model = new Model();
        model.setAge(35);
        model.setName("Ekbal");
        model.setCreated(new Date());
        models.add(model);


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
