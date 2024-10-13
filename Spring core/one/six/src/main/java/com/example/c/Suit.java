package com.example.c;

public class Suit {
    private String shirt;
    private String pants;

    private String coat;

    public Suit(){}

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    @Override
    public String toString() {
        return "the shirt is "+shirt+" ,the pant is "+pants+" the coat is "+coat+" in the suit";
    }
}
