package com.lexxkit;

public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public SlytherinStudents(String studentName, int magicPower, int transgressionDist, int cunning, int resoluteness, int ambition, int resourcefulness, int leadership) {
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

    public void compareWithStudent(SlytherinStudents opponent) {
        int traitsForThisStudent = cunning + resoluteness + ambition + resoluteness + leadership;
        int traitsForOpponent = opponent.cunning + opponent.resoluteness + opponent.ambition + opponent.resoluteness + opponent.leadership;
        if (traitsForThisStudent > traitsForOpponent) {
            System.out.printf("%s is better Slytherin student than %s", this.getStudentName(), opponent.getStudentName());
        } else if (traitsForThisStudent < traitsForOpponent) {
            System.out.printf("%s is better Slytherin student than %s", opponent.getStudentName(), this.getStudentName());
        } else {
            System.out.printf("Both %s and %s are equal Slytherin student", this.getStudentName(), opponent.getStudentName());
        }
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
