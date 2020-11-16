package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        List<String> readyList = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));){
            while (reader.ready()){
                String[]lineArr = reader.readLine().split(" ");
                for (int i = 0; i < lineArr.length; i++) {
                    if (lineArr[i].matches("........*")){
                        readyList.add(lineArr[i]);
                    }
                }
            }
            writer.append(String.join(",",readyList));
        }

    }
}
