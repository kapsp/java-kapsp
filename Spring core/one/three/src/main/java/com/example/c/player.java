package com.example.c;

public class player {
    private String name;
    private int goals;

    private Ownership own;

    public player(){}

    public player(Ownership own){
        this.own=own;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Ownership getOwn() {
        return own;
    }



    public String toString(){
        return  name+" has scored "+goals+" and its ownership is "+own;
    }
}
