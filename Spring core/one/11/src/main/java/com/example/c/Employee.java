package com.example.c;



public class Employee {
    private String name;
    private Manager manager;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void display()
    {
        System.out.println("Employee name is : "+name);
        System.out.println("Manager details are : "+manager);
    }
}

