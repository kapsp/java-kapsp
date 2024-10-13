package com.example.c;

import java.util.List;

public class Zoo {
    private List<String> animals;
   public Zoo(){}
    public Zoo(List<String> animals){
        this.animals=animals;
    }

    public List<String> getAnimals(){
        return animals;

    }

    public String toString(){
        return "animals are "+animals;
    }
}
