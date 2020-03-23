package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String j="";
        if (o instanceof Cow){
            j="Корова";
        }
        if(o instanceof Whale){
            j= "Кит";
        }
        if(o instanceof Pig){
            j= "Неизвестное животное";
        }
        if(o instanceof Dog){
            j= "Собака";
        }//Напишите тут ваше решение

        return j;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
