package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
       Set<Integer>iSet=new HashSet<>();
       while (iSet.size()<20){
           int num= (int) (Math.random()*101);
           iSet.add(num);
           // напишите тут ваш код
       }
       return iSet;

    }

    /*
    public static int rnd(){
         int num= (int) (Math.random()*21);
        //System.out.print(num+" ");
        return num;
    }

    // */

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            if (it.next()>10){it.remove();}
        }
        return set;// напишите тут ваш код

    }

    public static void main(String[] args) {
        /*
        Set <Integer>ifSet=createSet();

        Iterator<Integer>it=ifSet.iterator();
        int ch=0;
        while(it.hasNext()){ch++;
            System.out.print(ch+": "+it.next()+" ");
        }

        System.out.println("\n");

        removeAllNumbersGreaterThan10(ifSet);

        Iterator<Integer>it2=ifSet.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }


    //    */
    }
}
