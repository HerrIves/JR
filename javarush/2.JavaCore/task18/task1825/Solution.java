package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String>names = new ArrayList<>();
        namesReadSort(names);

        String endFile = names.get(0).split("\\.[a-zA-Z]*\\d*$")[0];
        //System.out.println(endFile);

        try(FileOutputStream fileOS = new FileOutputStream(endFile);)
        {
            for (String s : names) {
                byte[] fileByteArr = filesRead(s);
                fileOS.write(fileByteArr);
            }
        }



    }

    static void namesReadSort(ArrayList<String>names) throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            String curName;
            while(!(curName = reader.readLine()).equals("end")){
                names.add(curName);
            }
        }
        Collections.sort(names);
//        for (String s:names) {System.out.print(s+" ");} System.out.println(" ");
    }

    static byte[] filesRead(String nameFile) throws IOException {
        //File file2Read = new File(nameFile);
        byte[]fileByteArr = null;

        try(FileInputStream fileIS= new FileInputStream(nameFile);){
            fileByteArr = new byte[fileIS.available()];
            while (fileIS.available()>0){
                fileIS.read(fileByteArr);
            }
        }

        return fileByteArr;
    }
}
