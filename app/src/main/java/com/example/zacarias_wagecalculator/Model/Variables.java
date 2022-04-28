package com.example.zacarias_wagecalculator.Model;

public class Variables {
    private double Part, Overt, Balance, Effort, Result;
    private String name,
            employeeType = "";

    public Variables() {
    }

    public double getPart() {
        return Part;
    }

    public double getOvert() {
        return Overt;
    }

    public double getBalance() {
        return Balance;
    }

    public double getEffort() {
        return Effort;
    }

    public double getResult() {
        return Result;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setPart(double part) {
        Part = part;
    }

    public void setOvert(double overt) {
        Overt = overt;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setEffort(double effort) {
        Effort = effort;
    }

    public void setResult(double result) {
        Result = result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}



