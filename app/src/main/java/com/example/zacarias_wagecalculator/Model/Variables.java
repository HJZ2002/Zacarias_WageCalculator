package com.example.zacarias_wagecalculator.Model;

public class Variables {
    private double part, overt, balance, effort, result;
    private String name,
            employeeType = "";

    public Variables() {
    }

    //getters
    public double getPart() {
        return part;
    }

    public double getOvert() {
        return overt;
    }

    public double getBalance() {
        return balance;
    }

    public double getEffort() {
        return effort;
    }

    public double getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setPart(double part) {
        part = part;
    }

    //setters
    public void setOvert(double overt) {
        overt = overt;
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public void setEffort(double effort) {
        effort = effort;
    }

    public void setResult(double result) {
        result = result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}



