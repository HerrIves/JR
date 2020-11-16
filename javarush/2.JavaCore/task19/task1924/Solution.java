package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");

    }

    public static void main(String[] args) throws IOException {
        String fileName = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            fileName = reader.readLine();
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName));){
            while (fileReader.ready()){
                String[]lineArr = fileReader.readLine().split(" ");
                for (int i = 0; i < lineArr.length; i++) {
                    if (lineArr[i].matches("[0-9]|[1][1-2]")) {
                        lineArr[i] = map.get(Integer.parseInt(lineArr[i]));
                    }
                }
                System.out.println(String.join(" ", lineArr));
            }
        }
    }
}