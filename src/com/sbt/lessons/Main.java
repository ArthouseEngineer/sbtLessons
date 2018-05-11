package com.sbt.lessons;

import com.sbt.lessons.lessonTwo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        person Joann = new person("Joann", "Green", persongender.male);
        person Jack = new person("Jeck", "Nicholson", persongender.male);
        person Alla = new person("Alla", "Andreevna", persongender.female);
        person Alina = new person("Alina", "Grozova", persongender.female);
        person Victoria = new person("Viktoria", "Erina", persongender.female);

        Joann.marry(Alla);
        Jack.marry(Alina);

        boolean b = Victoria.marry(Joann);

        System.out.println("First name is : " + Joann.getFirstName() + " \nLast name is : " + Joann.getLastName() +
                "\nGender of person is : " + Joann.getGender() + "\nSupose is : " + Joann.getSpouse().getFirstName()
                + " " + Joann.getSpouse().getLastName());

        System.out.println();
        System.out.println(b);
        System.out.println();

        System.out.println("First name is : " + Jack.getFirstName() + " \nLast name is : " + Jack.getLastName() +
                "\nGender of person is : " + Joann.getGender() + "\nSupose is : " + Jack.getSpouse().getFirstName() +
                " " + Jack.getSpouse().getLastName());
    }
}
