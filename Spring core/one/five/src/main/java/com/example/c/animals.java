package com.example.c;

public class animals {
    private String name;

    public animals(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "the animal is "+name;
    }
}
