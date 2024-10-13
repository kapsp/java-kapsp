package com.example.c;

public class club implements Ownership{
    private String name;
    private int revenue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String toString(){
        return "name of the club is "+name+ " and revenue it generaated is "+revenue;
    }
}
