package com.example.sqllite;

public class Employee {
    private int sno;

    public Employee(int sno, String name, double increment) {
        this.sno = sno;
        this.name = name;
        this.increment = increment;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    private String name;
    private double increment;
}
