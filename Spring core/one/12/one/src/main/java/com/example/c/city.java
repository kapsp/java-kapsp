package com.example.c;

public class city {
    private String name;
    private Zoo z;

    public city(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zoo getZ() {
        return z;
    }

    public void setZ(Zoo z) {
        this.z = z;
    }

    public String toString(){
        return  z+" in "+name;
    }
}
