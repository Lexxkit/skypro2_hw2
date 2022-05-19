package com.lexxkit;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public Slytherin(String studentName, int magicPower, int transgressionDist, int cunning, int resoluteness, int ambition, int resourcefulness, int leadership) {
        super(studentName, magicPower, transgressionDist);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLeadership() {
        return leadership;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nCunning: %d\nResoluteness: %d\n" +
                                "Ambition: %d\nResourcefulness: %d\nLeadership: %d\n",
                        this.getClass().getSimpleName(), cunning, resoluteness,
                        ambition, resourcefulness, leadership);
    }
}
