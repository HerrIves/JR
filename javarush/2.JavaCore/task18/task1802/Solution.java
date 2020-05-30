package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String filePath = null;
            int minBite = 999;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                filePath = reader.readLine();
        }

                           minBite = minBit(filePath);
        System.out.println(minBite);
    }

    static int minBit(String filePath){
           int minBit=998;

        try(BufferedInputStream readStream = new BufferedInputStream(new FileInputStream(filePath))){
            int minBitTMP = 997;

            while(readStream.available()>0) {
                minBitTMP = readStream.read();
                //System.out.println(minBitTMP);

                if (minBit > minBitTMP) {
                    minBit = minBitTMP;
                }
            }
        } catch (IOException e) {e.printStackTrace();}

        return minBit;
    }
}
