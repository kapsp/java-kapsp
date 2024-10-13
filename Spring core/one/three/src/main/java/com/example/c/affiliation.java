package com.example.c;

public class affiliation implements Ownership {
    private String name;

    public affiliation (String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}
