package com.sbt.lessons.lessonTree.examples;


import com.sbt.lessons.lessonTree.Person;
import com.sbt.lessons.lessonTree.PersonFirstLoad;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example4_LinkedHashSet {


    public static void main(String[] args) {
        Set<Person> persons = new LinkedHashSet<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);



        System.out.println("size="+ persons.size());


    }

}
