package com.example.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class city {
    @Value("san deigo")
    private String name;
   @Autowired
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
