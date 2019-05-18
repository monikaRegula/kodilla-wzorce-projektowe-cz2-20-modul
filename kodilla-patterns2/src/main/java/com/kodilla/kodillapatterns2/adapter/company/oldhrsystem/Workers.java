package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"111", "John", "Wick"},
            {"112", "Ivone", "Escobar"},
            {"113", "Jassie", "Pinkman"},
            {"114", "Walter", "White"},
            {"115", "Ciara", "Lanson"}
    };
    private double[] salaries = {
            4500.0,
            3700.0,
            4350.0,
            9000.0,
            6700.0
    };
    public String getWorkers(int n){
        if (n>salaries.length){
            return "";
        }
        return workers[n][0] +", "+workers[n][1] + ", "+ workers[n][2] +", "+salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
