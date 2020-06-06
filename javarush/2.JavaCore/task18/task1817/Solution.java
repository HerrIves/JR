package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);//"c:/temp/temp.txt");
        int spacesNumb = 0;
        int charsNumb = 0;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));){
            while (reader.ready()){
                int current = reader.read();
                if (current == 32){
                    spacesNumb++;
                    //System.out.println(spacesNumb);
                }
                charsNumb++;
            }
        }
        if (charsNumb != 0){
            System.out.println(ratioSpChar(spacesNumb, charsNumb));
        }

    }

    static float ratioSpChar(int spacesNumb, int charsNumb){
        float result = ((float)(Math.round(((float) spacesNumb/(float)charsNumb)*10000)))/100;
    return result;
    }
}
