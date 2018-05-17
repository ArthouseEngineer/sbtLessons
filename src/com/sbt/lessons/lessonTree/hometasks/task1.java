package com.sbt.lessons.lessonTree.hometasks;

import java.io.*;
import java.util.*;

public class task1 {

    /*
     * Подсчитайте количество различных слов в файле
     * */
    public static void main(String[] args) throws IOException {
        new task1().run();
    }


    private void run() throws IOException {

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();


        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

        String currentLine = reader.readLine();

        currentLine.replaceAll("[^а-яА-Я a-zA-Z]", "");


        while (currentLine != null) {

            String[] words = currentLine.toLowerCase().split("[|,;:.!?\\s]+");

            for (String word : words) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
            currentLine = reader.readLine();

        }

        Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet);


        int sum = 0;

        for (Map.Entry<String, Integer> entry : list) {
            sum += entry.getValue();
        }
        System.out.println("Count words in file is : " + sum);
    }
}
