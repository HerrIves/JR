package com.javarush.task.task08.task0818;

import java.security.Key;
import java.security.KeyStore;
import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("иванов", 501);
        map.put("петров", 100);
        map.put("сидоров", 200);
        map.put("гончаров", 300);
        map.put("слабаков", 400);
        map.put("ревняков", 500);
        map.put("добряков", 600);
        map.put("синяков", 700);
        map.put("невняков", 800);
        map.put("родняков", 900);


        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
/*        for (Map.Entry entry:map.entrySet()) {
        String key = (String) entry.getKey();
        Integer value = (Integer) entry.getValue();
        //    System.out.println(key+" "+value);

        if (map.get(key) <= 500){map.remove(key);}
*/
          Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value < 500) {
                itr.remove();
            }
        }
    }//напишите тут ваш код


    public static void main(String[] args) {
/*
       Map<String, Integer> mMap = createMap();
        removeItemFromMap(mMap);
        for (Map.Entry entry : mMap.entrySet()) {
            String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println(key + " " + value);
        }

//    */
    }
}
