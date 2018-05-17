package com.sbt.lessons.lessonTree.hometasks;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import com.sbt.lessons.lessonTree.Person;

public class task5 {
    public static void main(String[] args) throws IOException {
        new task5().run();
    }

    private void run() {
        OneLinkedList linkedList = new OneLinkedList();
        linkedList.add(1);
        linkedList.add("dsd");
        linkedList.add(new Person(1L, "Байда Илья Вадимович,", "79185551234"));
        Iterator<OneLinkedList> iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
