package com.lexxkit;

public abstract class Hogwarts {
    private String studentName;
    private int magicPower;
    private int transgressionDist;

    public Hogwarts(String studentName, int magicPower, int transgressionDist) {
        this.studentName = studentName;
        this.magicPower = magicPower;
        this.transgressionDist = transgressionDist;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDist() {
        return transgressionDist;
    }
}
