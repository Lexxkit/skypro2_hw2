package com.lexxkit;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    GryffindorStudents harryPotter = new GryffindorStudents("Harry Potter", 55, 60, 70, 80, 90);
	    GryffindorStudents hermioneGrainger = new GryffindorStudents("Hermione Grainger", getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
	    GryffindorStudents ronWizley = new GryffindorStudents("Ron Wizley", getTrait(), getTrait(), getTrait(), getTrait(), getTrait());

        SlytherinStudents drakoMalfoy = new SlytherinStudents("Drako Malfoy", 50, 49, 76, 45,99,56, 87);
        SlytherinStudents grahamMontague = new SlytherinStudents("Graham Montague", getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
        SlytherinStudents gregoryGoyl = new SlytherinStudents("Gregory Goyl", getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait());

        HufflepuffStudents zacharySmith = new HufflepuffStudents("Zachary Smith", getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
        HufflepuffStudents sedrickDigorry = new HufflepuffStudents("Sedrick Digorry", getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
        HufflepuffStudents justinFlinch = new HufflepuffStudents("Justin Flinch", getTrait(), getTrait(), getTrait(), getTrait(), getTrait());

        RavenclawStudents choyChang = new RavenclawStudents("Choy Chang", getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
        RavenclawStudents padmaPatil = new RavenclawStudents("Padma Patil", getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait());
        RavenclawStudents markusBelbi = new RavenclawStudents("Markus Belbi", getTrait(), getTrait(), getTrait(), getTrait(), getTrait(), getTrait());

        System.out.println(harryPotter);
        System.out.println(zacharySmith);
        System.out.println(choyChang);
        System.out.println(drakoMalfoy);


    }

    private static int getTrait() {
        int randomNum = new Random().nextInt(100);
        return randomNum;
    }
}
