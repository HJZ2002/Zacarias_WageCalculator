package com.example.zacarias_wagecalculator.Model;

public class Variables {
    private double hours;
    private double overtime;
    private double regularwage;
    private double otwage;
    private double totalwage;
    private String name,
            employeetype = "";


    public Variables() { }

    //getters
    public double getHours() {
        return hours;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getRegularwage() {
        return regularwage;
    }

    public double getOtwage() {
        return otwage;
    }

    public double getTotalwage() {
        return totalwage;
    }

    public String getName() {
        return name;
    }

    public String getEmployeetype() {
        return employeetype;
    }

    //setters
    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public void setRegularwage(double regularwage) {
        this.regularwage = regularwage;
    }

    public void setOtwage(double otwage) {
        this.otwage = otwage;
    }

    public void setTotalwage(double totalwage) {
        this.totalwage = totalwage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeetype(String employeetype) {
        this.employeetype = employeetype;
    }

}
