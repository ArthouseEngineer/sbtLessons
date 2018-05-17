package com.sbt.lessons.lessonTree.examples;


import com.sbt.lessons.lessonTree.Person;
import com.sbt.lessons.lessonTree.PersonFirstLoad;

import java.util.LinkedList;

public class Example2_LinkedList {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();
        PersonFirstLoad.init(persons);
       // PersonFirstLoad.print(persons);

   /*     System.out.println("---------------------------------");
        System.out.println(persons.peek());

        System.out.println("---------------------------------");
        System.out.println(persons.poll());
*/
       /* persons.poll();
        persons.poll();
        persons.poll();
        persons.poll();*/

        System.out.println("---------------------------------");
        persons.forEach(System.out::println);

        System.out.println("---------------------------------");
        persons.pollLast();
        persons.forEach(System.out::println);

    }
}
