package com.sbt.lessons.lessonTree.examples;

import com.sbt.lessons.lessonTree.Person;
import com.sbt.lessons.lessonTree.PersonFirstLoad;

import java.util.ArrayList;
import java.util.List;


public class Example1_ArrayList {


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        PersonFirstLoad.init(persons);
       // PersonFirstLoad.print(persons);

        persons.forEach(System.out :: println);
/*

        System.out.println("--------------------------------");

        System.out.println(persons.get(5));
*/

        /*System.out.println(
       persons.contains(new Person(10L,"Бирюков Виктор Валерьевич","79185551234")));
*/

        /*
        System.out.println("--------------------------------");
        Collections.sort(persons);
        PersonFirstLoad.print(persons);
        System.out.println("--------------------------------");
        System.out.println(Collections.min(persons));
        System.out.println("--------------------------------");*/
      /*  Collection<Person> immutablePersons = Collections.unmodifiableCollection(persons);
        System.out.println(immutablePersons.size()); */
    }

}
