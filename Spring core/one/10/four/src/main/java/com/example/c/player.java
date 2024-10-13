package com.example.c;

public class player {
    private String name;
    private int goals;
    private club c1;

    private brand v;

    public player(){}

    public player(club c1, brand v) {

        this.c1 = c1;
        this.v = v;
    }

    public brand getV() {
        return v;
    }

    public void setV(brand v) {
        this.v = v;
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

    public club getC1() {
        return c1;
    }

    public void setC1(club c1) {
        this.c1 = c1;
    }

    public String toString(){
        return "playe is "+name+" he scored "+goals+" he is a player of "+c1+" who is ambassador of "+v;

    }
}
