package com.example.zacarias_wagecalculator.Controller;

public class Methods {

    public double Effort(double solvehours) {
        double solvemorehours;
        if (solvehours > 20) {
            solvemorehours = solvehours - 10;
        } else {
            solvemorehours = 0;
        }
        return solvemorehours;
    }

    //regularwage
    public double Time(String employee, double solvehours, double morehours) {
        double solveregularwage;
        if (employee.equals("Regular")) {
            solveregularwage = (solvehours - morehours) * 120;
        } else if (employee.equals("Probitionary")) {
            solveregularwage = (solvehours - morehours) * 100;
        } else {
            solveregularwage = (solvehours - morehours) * 80;
        }
        return solveregularwage;
    }
    //Overtime
    public double Overwork(String employee, double overtime) {
        double solveovertimewage;
        if (employee.equals("Regular")) {
            solveovertimewage = overtime * 105;
        } else if (employee.equals("Probitionary")) {
            solveovertimewage =overtime*94;
        }else {
            solveovertimewage=overtime*60;
        }
        return solveovertimewage;
    }
    public double Total(double regularwage, double overtimewage) {
        return regularwage + overtimewage;
    }
}




