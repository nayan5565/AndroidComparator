package com.example.nayan.listshorting;

import java.util.Date;

public class Model {
    private int age;
    private String name;
    private Date created;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
