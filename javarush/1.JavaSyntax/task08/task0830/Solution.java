package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
                    //((char)((int)(Math.random()*20+65)))+""+((char)(int)(Math.random()*20+65))+(char)(int)(Math.random()*20+65); //reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        for (int j = 0; j < 20; j++) {

            for (int i = j+1; i < 20; i++) {
                //System.out.println(array[j]+" "+array[i]);
                String min = array[j];
                if (isGreaterThan(min, array[i])) {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                    }
            }
        }//напишите тут ваш код
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        //System.out.println(a.compareTo(b));
        return a.compareTo(b) > 0;
    }
}
