package com.sbt.lessons.lessonTree.BeforeGenerics;


public class Apple {
    final Long id = counter++;
    static Long counter = new Long(0L);


    public Long getId() {
        return id;
    }

}
