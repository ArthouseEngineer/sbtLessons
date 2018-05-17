package com.sbt.lessons.lessonTree.examples;

import com.sbt.lessons.lessonTree.Person;
import com.sbt.lessons.lessonTree.PersonFirstLoad;

import java.util.*;


public class Example5_Map {


    public static void main(String[] args) {
        Map<String, Person> persons = new Hashtable<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);

        System.out.println("size="+ persons.size());

        System.out.println(persons.get("16"));


    }

}
