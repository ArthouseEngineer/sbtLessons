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
        Victoria.marry(Jack);
        Alina.marry(Joann);

        System.out.println(Joann.toString());

    }
}
