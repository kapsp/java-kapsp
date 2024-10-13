package com.example.c;

import java.util.List;

public class Balls {
    private List<String> types;

    public Balls(){}

    public void setTypes(List<String> types){
        this.types=types;
    }

    public List<String> getTypes(){
        return types;
    }

    public String toString(){
        return "the ball types in shop are "+types;
    }
}
