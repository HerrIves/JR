package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat>hMap=new HashMap<String, Cat>();
        hMap.put("first",new Cat("first"));
        hMap.put("second",new Cat("second"));
        hMap.put("third",new Cat("third"));
        hMap.put("fourth",new Cat("fourth"));
        hMap.put("fifth",new Cat("fifth"));
        hMap.put("sixth",new Cat("sixth"));
        hMap.put("seventh",new Cat("seventh"));
        hMap.put("eith",new Cat("eith"));
        hMap.put("neunth",new Cat("neunth"));
        hMap.put("tenth",new Cat("tenth"));

        return hMap;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat>set=new HashSet<Cat>(map.values());
        return  set;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
