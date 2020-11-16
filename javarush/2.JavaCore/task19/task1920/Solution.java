package com.javarush.task.task19.task1920;

import java.io.*;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Map <String, Double> hMap = new TreeMap<>();


        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));){
            String[] line = new String[2];
            while (reader.ready()){
                line = reader.readLine().split(" ");
                hMap.merge(line[0], Double.parseDouble(line[1]), Double::sum);
            }
        }

        Double max = Collections.max(hMap.values());
        for (Map.Entry entry: hMap.entrySet()) {
           // System.out.println(entry);
            if (max.equals(entry.getValue())){
                System.out.println(entry.getKey());
            }
        }
    }
}
