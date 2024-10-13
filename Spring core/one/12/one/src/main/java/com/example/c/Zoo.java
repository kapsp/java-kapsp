package com.example.c;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("z1")
public class Zoo {
    @Value("MaharaajBagh zoo")
    private String name;

    public Zoo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
