package com.sbt.lessons.lessonTree.hometasks;

import java.io.*;

public class task4 {

    public static void main(String[] args) throws IOException {
        new task4().run();
    }

    private  void  run() throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader("input.txt"));

        while (fileIn.ready()){
            String line = fileIn.readLine();
            System.out.println(new StringBuffer(line).reverse().toString());
        }
        fileIn.close();
    }

}
