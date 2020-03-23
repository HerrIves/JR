package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов, осталось удалить
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
///*
        Iterator<Cat>i=cats.iterator();
        while(i.hasNext()){
            Cat r=i.next();
//            if (r==cat1){
                i.remove();break;
//            }
        }

// */

//        cats.remove(cat1);

/*
        for(Cat cat:cats){
            Object cat1;
            if (cat.equals(cat1)) cats.remove(cat);}//напишите тут ваш код. step 3 - пункт 3
//*/
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set <Cat>cats=new HashSet<>();
        Cat cat1=new Cat();
        cats.add(cat1);
        Cat cat2=new Cat();
        cats.add(cat2);
        Cat cat3=new Cat();
        cats.add(cat3);
                            //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat cat:cats){
            System.out.println(cat);
        }// step 4 - пункт 4
    }

    public static class Cat {

    }// step 1 - пункт 1
}
