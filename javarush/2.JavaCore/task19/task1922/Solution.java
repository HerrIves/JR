package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName));){
            while (fileReader.ready()){
                String wordLine = fileReader.readLine();
                String [] wordsArr = wordLine.split(" ");

                int wordsNumber = 0;

                for (String tempWord : wordsArr) {
                    if (words.contains(tempWord)){
                    wordsNumber++;
                    }
                }
                if (wordsNumber == 2){
                    System.out.println(wordLine);
                }
            }
        }


    }
}
