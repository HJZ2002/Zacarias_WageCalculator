package com.example.zacarias_wagecalculator.Model;

public class Variables {
    private double part, effort, balance, over, all;
    private String name,
            employeeType = "";

    public Variables() {
    }

    public double getPart() {
        return part;
    }

    public double getEffort() {
        return effort;
    }

    public double getBalance() {
        return balance;
    }

    public double getOver() {
        return over;
    }

    public double getAll() {
        return all;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setPart(double part) {
        this.part = part;
    }

    public void setEffort(double effort) {
        this.effort = effort;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOver(double over) {
        this.over = over;
    }

    public void setAll(double all) {
        this.all = all;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}






