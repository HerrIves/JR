package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        readAndwrite();
    }



    public static void main(String[] args) {
        System.out.println(lines);
    }

    public static void readAndwrite() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String fileLine = reader.readLine();//reader.read()!=-1
            while (fileLine.equals(null)==false) {//reader.ready()
                //System.out.println(fileLine);
                lines.add(fileLine);
                fileLine = reader.readLine();


            }
            reader.close();

        } catch (Exception e) {
            //System.out.println(e);

        }
    }
}
