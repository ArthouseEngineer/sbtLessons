package com.sbt.lessons.lessonTree.examples;

import com.sbt.lessons.lessonTree.Person;
import com.sbt.lessons.lessonTree.PersonFirstLoad;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Admin on 18.07.2016.
 */
public class Example3_TreeSet {


    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        PersonFirstLoad.init(persons);
      //  PersonFirstLoad.print(persons);

        persons.forEach(s -> System.out.println(s));

        System.out.println("size="+ persons.size());


    }

}
