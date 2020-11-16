package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));){

            while (reader.ready()){
                String[] lineArr = reader.readLine().split(" ");

                for (String cline: lineArr) {
                    if (cline.matches(".*\\d.*")){
                        writer.append(cline);
                        writer.append(' ');
                    }
                }
            }
        }
    }
}
