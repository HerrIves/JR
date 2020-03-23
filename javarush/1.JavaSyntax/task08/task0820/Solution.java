package com.javarush.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);

        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for(int i=0;i<4;i++){
            result.add(new Cat());
        }
        //напишите тут ваш код
//        System.out.println(result);
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result=new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
//        System.out.println(result);//напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object>join=new HashSet<>();
        join.addAll(cats);
        join.addAll(dogs);//напишите тут ваш код
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object>itr=pets.iterator();
        while (itr.hasNext()) {
            Object next =itr.next();

            Iterator<Cat>itC=cats.iterator();
            while(itC.hasNext()){
                Cat nextC=itC.next();

            if (next.equals(nextC)) {
                itr.remove();
            }
        }
        }//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
//        Iterator itr=pets.iterator();
//            while(itr.hasNext()) {
        for (Object objN:pets) {
            System.out.println(objN);
        }

        //напишите тут ваш код
    }

    public static class Cat{

    }
    public static class Dog{

    }//напишите тут ваш код
}
