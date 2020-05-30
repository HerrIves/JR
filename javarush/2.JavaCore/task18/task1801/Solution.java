package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){
        String pathFile= null;
        int maxBite = 0;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            pathFile = reader.readLine();
        } catch (IOException e) {e.printStackTrace();}

        maxBite = maxBitF(pathFile);
        System.out.println(maxBite);
    }

    public static int maxBitF(String pathFile){
        int bite = 0;

        try (BufferedInputStream buff = new BufferedInputStream(new FileInputStream(pathFile))) {
            int biteTMP=0;

            while (buff.available()>0){
                biteTMP = buff.read();
                //System.out.println("biteTMP "+biteTMP);

                if (biteTMP > bite){
                    bite = biteTMP;
                }
            }
        } catch (IOException e) {e.printStackTrace();}

        //System.out.println(bite);
        return bite;
    }
}
