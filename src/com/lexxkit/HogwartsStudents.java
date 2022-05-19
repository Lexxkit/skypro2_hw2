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

    public void compareWithHogwartsStudent(HogwartsStudents opponent) {
        int traitsForThisStudent = magicPower + transgressionDist;
        int traitsForOpponent = opponent.magicPower + opponent.transgressionDist;
        if (traitsForThisStudent > traitsForOpponent) {
            System.out.printf("%s is more powerful than %s\n", this.getStudentName(), opponent.getStudentName());
        } else if (traitsForThisStudent < traitsForOpponent) {
            System.out.printf("%s is more powerful than %s\n", opponent.getStudentName(), this.getStudentName());
        } else {
            System.out.printf("Both %s and %s are equal\n", this.getStudentName(), opponent.getStudentName());
        }
    }

    @Override
    public String toString() {
        return String.format("This is %s.\nMagic power: %d\nTransgression distance: %d\n",
                studentName, magicPower, transgressionDist);
    }
}
