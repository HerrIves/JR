package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(
                decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        String returnString = new String("");

        StringBuffer sb = new StringBuffer();

        if (reader != null) {
            int ch = 0;
            for (ch = reader.read(); ch > -1; ch = reader.read()) {
                sb.append((char) (ch + key));
            }
        }

        returnString = sb.toString();
        return returnString;
    }
}
