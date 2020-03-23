package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(reader.readLine());
        }

        //for (int i:array) { System.out.print(i+" ");  }

        sort(array);

        //System.out.print("\n"); for (int i:array) { System.out.print(i+" ");}

       ///*
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

         //*/

    }

    /*public static int rnd() {
        int num = (int) (Math.random() * 99-20);
        //System.out.print(num+" ");
        return num;
    }
     */

    //*/


    public static void sort(int[] array) {


        for (int j=0;j<array.length;j++) {

                                                                           //System.out.println(" i pered "+j);
            int max=-999;
            for (int i = j; i < array.length; i++) {
                                                                                //System.out.println(i +" i pered z "+j);
                if (array[i] >= max){ max = array[i]; array[i]=array[j]; array[j] = max;}

                                                                //System.out.println(i+ " i posle z "+j+ "array3 "+array[3]);
            }
                                                                //System.out.println(i+" i posle "+j);


        }
    }
}
