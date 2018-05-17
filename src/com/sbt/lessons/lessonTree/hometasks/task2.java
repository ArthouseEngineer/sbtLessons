package com.sbt.lessons.lessonTree.hometasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        new task2().run();
    }


    /*
    Выведите на экран список различных слов файла,
    отсортированный по возрастанию их длины (компаратор сначала по длине слова, потом по тексту).
     */

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

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return (e1.getKey().compareTo(e2.getKey()));
            }
        });



        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Word - " + entry.getKey() + " count - " + entry.getValue());
        }
    }
}