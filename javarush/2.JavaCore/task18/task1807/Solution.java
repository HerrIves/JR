package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        String path = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            path = reader.readLine();
        } catch (IOException e) {e.printStackTrace();}

        comaReadCount(path);

    }

    static void comaReadCount(String path){
        int currentBite = 0;
        int comaBites = 0;

        try (BufferedInputStream readFile = new BufferedInputStream(new FileInputStream(path))){
            Date date2 = new Date();

            while(readFile.available() > 0){
                currentBite = readFile.read();
                if (currentBite == 44){
                    comaBites++;
                }
            }

            System.out.println((new Date().getTime() - date2.getTime()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(comaBites);
    }
}
