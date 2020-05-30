package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String path = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            path = reader.readLine();
        }
        readAndSort(path);
    }

    static void readAndSort(String path){
        int[]biteA = new int[255];
        try(BufferedInputStream iStream = new BufferedInputStream(new FileInputStream(path))){
            int curBite = 0;

            while (iStream.available() > 0){
            curBite = iStream.read();
            biteA[curBite] = curBite;
            }
        } catch (IOException e) { e.printStackTrace(); }

        for (int i = 0; i < 255; i++) {
            if (biteA[i] > 0){
                System.out.print(biteA[i]+" ");
            }
        }
    }
}
