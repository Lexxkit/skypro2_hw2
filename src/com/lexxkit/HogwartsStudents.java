package com.lexxkit;

public abstract class HogwartsStudents {
    private String studentName;
    private int magicPower;
    private int transgressionDist;

    public HogwartsStudents(String studentName, int magicPower, int transgressionDist) {
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

    @Override
    public String toString() {
        return String.format("This is %s.\nMagic power: %d\nTransgression distance: %d\n",
                studentName, magicPower, transgressionDist);
    }
}
