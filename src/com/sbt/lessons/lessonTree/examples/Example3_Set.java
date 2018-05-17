package com.sbt.lessons.lessonTree.examples;

import com.sbt.lessons.lessonTree.*;

import java.util.HashSet;
import java.util.Set;


public class Example3_Set {


    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);



        System.out.println("size="+ persons.size());


    }

}
