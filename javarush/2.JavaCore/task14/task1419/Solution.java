package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        BufferedReader Breader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        try {
            Breader.readLine();
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            Breader.close();
        } catch (IOException e) {
            exceptions.add(e);
        }

        FileReader reader = null;
        try {
            reader = new FileReader("c:/temp.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
