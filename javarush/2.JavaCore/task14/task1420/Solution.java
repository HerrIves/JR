package com.javarush.task.task14.task1420;

/* НОД */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int a = readNumb();
        int b = readNumb();
        //System.out.println("a="+a+" b="+b);

        if (a==0||b==0){                            //если одно число ноль сразу выводим второе
            System.out.println((a==0?b:a));
        }else if ((a>b?a:b) % (a<b?a:b)==0){       // если одно число кратно другому сразу выводим
            System.out.println((a<b?a:b));
        }else {

            System.out.println(maxDev(a,b));       // ищем НОД, выводим


        }
    }
    public static int readNumb() {
        Integer a = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String aString = null;
            try {
                aString = reader.readLine();
            } catch (IOException e) {
                System.out.println("Input Error");;
            }
            try {

                a = Integer.parseInt(aString);
                if (a <= 0) {
                    continue;
                }else break;
            } catch (NumberFormatException e) {
                System.out.println("возникло искючение");
            }
        }
        return (int) a;
    }

    public static int maxDev(int a, int b){
        int maxDel = 0;

        ArrayList<Integer> aDel = new ArrayList<Integer>();
        for (int i = 1; i < (a < b ? a : b); i++) {
            if ((a < b ? a : b) % i == 0) {
                aDel.add(i);                //System.out.println(i);
            }
        }

        for (Integer i : aDel) {
            if ((a > b ? a : b) % i == 0) {
                maxDel = i;
            }
        }

        return maxDel;
    }
}
