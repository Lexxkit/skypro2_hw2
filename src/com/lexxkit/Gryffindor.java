package com.lexxkit;

public class Gryffindor extends Hogwarts {
    private int generosity;
    private int honour;
    private int bravery;

    public Gryffindor(String studentName, int magicPower, int transgressionDist, int generosity, int honour, int bravery) {
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
}
