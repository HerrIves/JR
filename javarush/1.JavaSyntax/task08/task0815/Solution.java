package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String>ssMap=new HashMap<>();
        ssMap.put("иванов","иван");
        ssMap.put("петров","иван");
        ssMap.put("сидоров","иван");
        ssMap.put("воронцов","сидр");
        ssMap.put("ленцов","сидр");
        ssMap.put("систов","сидр");
        ssMap.put("местов","петр");
        ssMap.put("красов","петр");
        ssMap.put("андров","петр");
        ssMap.put("иксов","петван");
/*
        Iterator<Map.Entry<String,String>>it=ssMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String>entry=it.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }

*/
        return ssMap;
        //напишите тут ваш код
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
    int nNames=0;
    Iterator<Map.Entry<String,String>>itr=map.entrySet().iterator();
    while(itr.hasNext()){
        Map.Entry<String,String>entry=itr.next();
        String key=entry.getKey();
        String value=entry.getValue();
        if (value.equals(name)){nNames++;}
    }
    return nNames;//напишите тут ваш код
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int nLNames=0;
        Iterator<Map.Entry<String,String>>itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String>entry=itr.next();
            String key=entry.getKey();
            String value=entry.getValue();
            if (key.equals(lastName)){nLNames++;}
        }
        return nLNames;//напишите тут ваш код
        //напишите тут ваш код

    }

    public static void main(String[] args) {
/*        Map<String,String>ssMap=createMap();
        int nNames=getCountTheSameFirstName(ssMap,"петр");
        System.out.println(nNames);
        int nLNames=getCountTheSameLastName(ssMap,"иванов");
        System.out.println(nLNames);


 */
    }

}

