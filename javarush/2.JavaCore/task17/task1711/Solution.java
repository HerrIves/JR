package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[]args) {

        int commandCut = 0;
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                commandCut = 3;
                createCommand(args, commandCut);}
                break;
            case "-u":
                synchronized (allPeople){
                commandCut = 4;
                updateCommand(args, commandCut);}
                break;
            case "-d":
                synchronized (allPeople){
                commandCut = 1;
                deliteCommand(args, commandCut);}
                break;
            case "-i":
                synchronized (allPeople){
                commandCut = 1;
                infoCommand(args, commandCut);}
                break;
            }

        //start here - начни тут
    }

    public static void createCommand(String[] args, int commandCut){
        String[] argsCuted = null;

        argsCuted = new String[commandCut];
        for (int j = 1; j < args.length; j=j+commandCut) {
            for (int i = 0; i < commandCut; i++) {
                argsCuted[i] = args[j+i];
            }
            if (argsCuted[1].equals("м")){
                allPeople.add(Person.createMale(argsCuted[0], dateCommand(argsCuted[2])));
            }else{
                allPeople.add(Person.createFemale(argsCuted[0], dateCommand(argsCuted[2])));
            }
            System.out.println(allPeople.size()-1);
        }
    }

    public static void updateCommand(String[] args, int commandCut){
        String[] argsCuted = null;

        argsCuted = new String[commandCut];
        for (int j = 1; j < args.length; j=j+commandCut) {
            for (int i = 0; i < commandCut; i++) {
                argsCuted[i] = args[j+i];
            }
            //System.out.println(allPeople.get(1).getName()+" "+allPeople.get(1).getBirthDate());
            Person updatePerson = allPeople.get(Integer.parseInt(argsCuted[0]));
            updatePerson.setName(argsCuted[1]);
            updatePerson.setSex(argsCuted[2].equals("м")?Sex.MALE:Sex.FEMALE);
            updatePerson.setBirthDate(dateCommand(argsCuted[3]));
            //System.out.println(allPeople.get(1).getName()+" "+allPeople.get(1).getBirthDate());
        }
    }

    public static void deliteCommand(String[] args, int commandCut){
        String[] argsCuted = null;

        argsCuted = new String[commandCut];
        for (int j = 1; j < args.length; j=j+commandCut) {
            for (int i = 0; i < commandCut; i++) {
                argsCuted[i] = args[j+i];
            }
            System.out.println(allPeople.get(1).getName()+" "+allPeople.get(1).getBirthDate());
            Person delitePerson = allPeople.get(Integer.parseInt(argsCuted[0]));
            delitePerson.setName(null);
            delitePerson.setSex(null);
            delitePerson.setBirthDate(null);
            System.out.println(allPeople.get(1).getName()+" "+allPeople.get(1).getBirthDate());
        }
    }

    public static void infoCommand(String[] args, int commandCut){
        String[] argsCuted = null;

        argsCuted = new String[commandCut];
        for (int j = 1; j < args.length; j=j+commandCut) {
            for (int i = 0; i < commandCut; i++) {
                argsCuted[i] = args[j+i];
            }
            Person infoPerson = allPeople.get(Integer.parseInt(argsCuted[0]));
            SimpleDateFormat dateFormatCommand = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(infoPerson.getName()+(infoPerson.getSex()==Sex.MALE?" м ":" ж ")+ dateFormatCommand.format(infoPerson.getBirthDate()));
        }
    }

    public static void parseParam(String[] args,int commandCut){

        String[] argsCuted = null;

        argsCuted = new String[commandCut];
        for (int j = 1; j < args.length; j=j+commandCut) {
            for (int i = 0; i < commandCut; i++) {
                argsCuted[i] = args[j+i];
            }
            for (int i = 0; i < argsCuted.length; i++) {

            }
        }
    }

    public static Date dateCommand(String stringDate){
        SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
        Date returnDate = null;
        try {
            returnDate = parser.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }
}
