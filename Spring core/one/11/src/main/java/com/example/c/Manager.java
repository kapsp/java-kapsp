package com.example.c;

public class Manager {
    private String managerId;
    private Employee employee;

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Manager(Employee employee) {
        super();
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager [managerId=" + managerId + ", employee=" + employee + "]";
    }

}
