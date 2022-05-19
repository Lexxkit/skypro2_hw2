package com.lexxkit;

import java.util.Objects;

public class GryffindorStudents extends HogwartsStudents {
    private int generosity;
    private int honour;
    private int bravery;

    public GryffindorStudents(String studentName, int magicPower, int transgressionDist, int generosity, int honour, int bravery) {
        super(studentName, magicPower, transgressionDist);
        this.generosity = generosity;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getGenerosity() {
        return generosity;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareWithStudent(GryffindorStudents opponent) {
        int traitsForThisStudent = generosity + honour + bravery;
        int traitsForOpponent = opponent.generosity + opponent.honour + opponent.bravery;
        if (traitsForThisStudent > traitsForOpponent) {
            System.out.printf("%s is better Gryffindor student than %s", this.getStudentName(), opponent.getStudentName());
        } else if (traitsForThisStudent < traitsForOpponent) {
            System.out.printf("%s is better Gryffindor student than %s", opponent.getStudentName(), this.getStudentName());
        } else {
            System.out.printf("Both %s and %s are equal Gryffindor student", this.getStudentName(), opponent.getStudentName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nGenerosity: %d\n" +
                "Honour: %d\nBravery: %d\n", this.getClass().getSimpleName(), generosity, honour, bravery);
    }
}
