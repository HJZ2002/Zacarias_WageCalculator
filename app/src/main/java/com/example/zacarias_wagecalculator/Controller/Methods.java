package com.example.zacarias_wagecalculator.Controller;

public class Methods {

    public double Effort(double hours){
        double overtime;
        if (hours > 8) {
            overtime = hours - 8;
        } else {
            overtime = 0;
        }
        return overtime;
    }

    public double Time(String employeeType, double hours, double overtime){
        double regWage;
        if (employeeType.equals("Regular")){
            regWage = (hours - overtime) * 100;
        } else if (employeeType.equals("Probationary")){
            regWage = (hours - overtime) * 90;
        } else {
            regWage = (hours - overtime) * 75;
        }
        return regWage;
    }

    public double Overwork(String employeeType, double overtime){
        double otWage;
        if (employeeType.equals("Regular")){
            otWage = overtime * 115;
        } else if (employeeType.equals("Probationary")){
            otWage = overtime * 100;
        } else {
            otWage = overtime * 90;
        }
        return otWage;
    }

    public double Total(double regWage, double otWage){
        return regWage + otWage;
    }
}




