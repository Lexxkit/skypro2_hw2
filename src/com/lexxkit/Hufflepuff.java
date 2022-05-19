package com.lexxkit;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int magicPower, int transgressionDist, int diligence, int loyalty, int honesty) {
        super(studentName, magicPower, transgressionDist);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nDiligence: %d\n" +
                        "Loyalty: %d\nHonesty: %d\n", this.getClass().getSimpleName(), diligence, loyalty, honesty);
    }
}
