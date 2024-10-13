package com.example.c;

public class animal {
    private species type;
    private String name;

    public animal(){}
    public species getSpecies() {
        return type;
    }

    public void setSpecies(species type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "the animal is "+name+" and its of species of "+type;
    }
}
