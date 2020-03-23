package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("иванов", "иван");
        map.put("петров", "иван");
        map.put("сидоров", "иван");
        map.put("воронцов", "сидр");
        map.put("ленцов", "сидр");
        map.put("систов", "сидр");
        map.put("местов", "петр");
        map.put("красов", "петр");
        map.put("андров", "петр");
        map.put("иксов", "петван");

        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String>aList=new ArrayList<>(map.values());
        for (int i=0;i< aList.size();i++){int dubI=0;String dubS=aList.get(i);
            for (int j=i+1;j<aList.size();j++){if (aList.get(i).equals(aList.get(j))){dubI++;}}
        if (dubI>0){removeItemFromMapByValue(map, aList.get(i));}
        }
        //for (String aLstV:aLIst) System.out.println(aLstV);
//            System.out.println(map.get(value));

        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
/*        System.out.println("0817");
        Map<String,String>map=createMap();
        map.forEach((a,b)-> System.out.println(a+" 1 "+b) );
        removeTheFirstNameDuplicates(map);
        map.forEach((a,b)-> System.out.println(a+" 2 "+b) );
*/
    }
}
