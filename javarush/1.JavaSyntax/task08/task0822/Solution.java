package com.javarush.task.task08.task0822;

//import com.sun.deploy.security.SelectableSecurityManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
//        for (Integer entry:integerList) {
//            System.out.println(entry);
//        }
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min=array.get(0);
        for (int i=1;i<array.size();i++){
            if (array.get(i)<min)min=array.get(i);
        }// Найти минимум тут
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {

        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        List<Integer>iList=new ArrayList<>(in); // Создать и заполнить список тут

        for (int i=0;i<in;){
//            break; else              //проверить ввод
            iList.add(sc.nextInt());i++;
        }
        return iList;
    }
}
