package com.sbt.lessons;

import com.sbt.lessons.lessonTwo.*;


public class Main {

    public static void main(String[] args) {
        person p = new person("Joann", "Green", persongender.male);
        p.setSpouse(p);
        System.out.println("First name is : " + p.getFirstName() + " \nLast name is : " + p.getLastName() +
        "\nGender of person is : " + p.getGender());
    }
}
