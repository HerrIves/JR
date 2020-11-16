package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        try(BufferedReader reader = new BufferedReader((new FileReader(fileName)));){
            while (reader.ready()){
                String line = reader.readLine();
                String[] lineArr = line.split(" ");
                //System.out.println((Integer.parseInt(lineArr[lineArr.length-1])) +" "+ (Integer.parseInt(lineArr[lineArr.length-2]))+" "+ Integer.parseInt(lineArr[lineArr.length-3]));
                Date cDate = new Date(Integer.parseInt(lineArr[lineArr.length-1])-1900, Integer.parseInt(lineArr[lineArr.length-2])-1, Integer.parseInt(lineArr[lineArr.length-3]));
                String cName = "";
                for (int i = 0; i < lineArr.length-3; i++) {
                    //cName = line.substring(0, line.length()-lineArr.length[-1]);
                    cName = cName + " "+ lineArr[i];
                }

                PEOPLE.add(new Person(cName.trim(), cDate));
            }
        }
        for (Person person:PEOPLE) {
            System.out.println(person.getName());
        }


    }
}
