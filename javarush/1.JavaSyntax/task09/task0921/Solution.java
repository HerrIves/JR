package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>hSet=new ArrayList<>();
        try{
            while (true) {
            hSet.add(sc.nextInt());
            }
        }
        catch (Exception e){

        }
        finally {
            for (Integer n:hSet) {
                System.out.println(n);
            }//напишите тут ваш код
        }
    }
}
