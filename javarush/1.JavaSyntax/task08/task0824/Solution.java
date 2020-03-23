package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human sin1=new Human("sin1",15,true);
        Human sin2=new Human("sin2",12,true);
        Human do4=new Human("do4",8,false);

        Human mat=new Human("mat",36,false); mat.children.add(sin1);mat.children.add(sin2);mat.children.add(do4);
        Human otez=new Human("otez",38,true);otez.children.add(sin1);otez.children.add(sin2);otez.children.add(do4);

        Human ded1=new Human("ded1",65,true);ded1.children.add(otez);
        Human baba1=new Human("baba1",63,false);baba1.children.add(otez);

        Human ded2=new Human("ded2",63,true);ded2.children.add(mat);
        Human baba2=new Human("baba2",62,false); baba2.children.add(mat);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(otez);
        System.out.println(mat);
        System.out.println(sin1);
        System.out.println(sin2);
        System.out.println(do4);//напишите тут ваш код
    }

    public static class Human{
        String name;
        int age;
        boolean sex;
        ArrayList<Human>children=new ArrayList<>();

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
