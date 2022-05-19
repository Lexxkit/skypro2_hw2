package com.lexxkit;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String studentName, int magicPower, int transgressionDist, int intelligence, int wisdom, int wit, int creativity) {
        super(studentName, magicPower, transgressionDist);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nIntelligence: %d\nWisdom: %d\nWit: %d\nCreativity: %d\n",
                        this.getClass().getSimpleName(), intelligence, wisdom, wit, creativity);
    }
}
