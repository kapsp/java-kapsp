package com.example.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class city {
    @Value("san deigo")
    private String name;

     @Autowired
    private Company company;


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public city(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString(){
        return  company+" in "+name;
    }
}
