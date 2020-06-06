package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.nio.charset.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file1 = new File(args[0]);
        int[] bAmount = new int[254];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), StandardCharsets.US_ASCII))) {             //read file
            int curChar = 0;
            while (reader.ready()) {
                curChar = reader.read();
                    bAmount[curChar]++;
            }
        }

        for (int i = 0; i < bAmount.length; i++) {                                                                                                     //output symbols Amount
            if (bAmount[i] > 0) {
                System.out.println((char) i + " " + bAmount[i]);
            }
        }
    }
}

