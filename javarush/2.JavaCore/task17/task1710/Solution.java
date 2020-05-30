package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //inputCommand(); start here - начни тут
    }

    public static void inputCommand(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayCommand = null;

        try {
            arrayCommand = reader.readLine().split(" ");
        } catch (IOException e) {e.printStackTrace();
        }finally {
            try {
                reader.close();} catch (IOException e) {e.printStackTrace();
            }
        }

        if (arrayCommand[0].equals("-c")){
            if (arrayCommand[2].equals("м")){
                allPeople.add(Person.createMale(arrayCommand[1], new Date(arrayCommand[3])));
            }else{
                allPeople.add(Person.createFemale(arrayCommand[1], new Date(arrayCommand[3])));
            }

        }
        if (arrayCommand[0].equals("-u")){
            Person updatePerson = allPeople.get(Integer.parseInt(arrayCommand[1]));
            updatePerson.setName(arrayCommand[2]);
            updatePerson.setSex(arrayCommand[3].equals("м")?Sex.MALE:Sex.FEMALE);
            updatePerson.setBirthDate(new Date(arrayCommand[4]));
        }
        if (arrayCommand[0].equals("-d")){
            Person delitePerson = allPeople.get(Integer.parseInt(arrayCommand[1]));
            delitePerson.setName(null);
            delitePerson.setSex(null);
            delitePerson.setBirthDate(null);
        }
        if (arrayCommand[0].equals("-i")){
            Person infoPerson = allPeople.get(Integer.parseInt(arrayCommand[1]));
            SimpleDateFormat dateFormatCommand = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(infoPerson.getName()+(infoPerson.getSex()==Sex.MALE?" м ":" ж ")+ dateFormatCommand.format(infoPerson.getBirthDate()));
        }/*-i 0 Миронов м 15/04/1990  -c Миронов м 15/04/1990
         */
        //System.out.println(allPeople.get(0).getName());
    }
}
