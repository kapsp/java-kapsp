package com.example.c;

public class Beverages {
    private String name;

    private String type;

    public Beverages(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return "drink is "+type+name;
    }
}
