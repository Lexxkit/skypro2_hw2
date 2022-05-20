package com.lexxkit;

public class RavenclawStudents extends HogwartsStudents {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudents(String studentName, int magicPower, int transgressionDist, int intelligence, int wisdom, int wit, int creativity) {
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

    public void compareWithStudent(RavenclawStudents opponent) {
        int traitsForThisStudent = intelligence + wisdom + wit + creativity;
        int traitsForOpponent = opponent.intelligence + opponent.wisdom + opponent.wit + opponent.creativity;
        if (traitsForThisStudent > traitsForOpponent) {
            System.out.printf("%s is better Ravenclaw student than %s\n", this.getStudentName(), opponent.getStudentName());
        } else if (traitsForThisStudent < traitsForOpponent) {
            System.out.printf("%s is better Ravenclaw student than %s\n", opponent.getStudentName(), this.getStudentName());
        } else {
            System.out.printf("Both %s and %s are equal Ravenclaw student\n", this.getStudentName(), opponent.getStudentName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("Faculty: %s\nIntelligence: %d\nWisdom: %d\nWit: %d\nCreativity: %d\n",
                        this.getClass().getSimpleName(), intelligence, wisdom, wit, creativity);
    }
}
