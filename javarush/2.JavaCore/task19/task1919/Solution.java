package com.javarush.task.task19.task1919;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.KeyStore;
import java.util.*;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        HashMap<String, Double> map = new HashMap();
        String key = "";
        Double value = 0.0;

        try(FileReader fileReader = new FileReader(fileName); BufferedReader reader = new BufferedReader(fileReader);)
        {
            while (reader.ready()) {
                boolean mapContainsKey = false;
                String[] readLine = reader.readLine().split(" ");
                key = readLine[0];
                value = Double.parseDouble(readLine[1]);

                for (Map.Entry<String,Double>entry:map.entrySet()) {
                    if (entry.getKey().equals(key)){
                        value = entry.getValue() + value;
                        entry.setValue(value);
                        mapContainsKey = true;
                    }
                }
                if (!mapContainsKey){map.put(key, value); }
            }
        }

        List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        for (Map.Entry entry: list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
