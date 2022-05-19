package com.lexxkit;

public class HufflepuffStudents extends HogwartsStudents {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String studentName, int magicPower, int transgressionDist, int diligence, int loyalty, int honesty) {
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

    public void compareWithStudent(HufflepuffStudents opponent) {
        int traitsForThisStudent = diligence + loyalty + honesty;
        int traitsForOpponent = opponent.diligence + opponent.loyalty + opponent.honesty;
        if (traitsForThisStudent > traitsForOpponent) {
            System.out.printf("%s is better Hufflepuff student than %s\n", this.getStudentName(), opponent.getStudentName());
        } else if (traitsForThisStudent < traitsForOpponent) {
            System.out.printf("%s is better Hufflepuff student than %s\n", opponent.getStudentName(), this.getStudentName());
        } else {
            System.out.printf("Both %s and %s are equal Hufflepuff student\n", this.getStudentName(), opponent.getStudentName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nDiligence: %d\n" +
                        "Loyalty: %d\nHonesty: %d\n", this.getClass().getSimpleName(), diligence, loyalty, honesty);
    }
}
