package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("my.properties"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) {
        StringWriter sw = new StringWriter();

        try {
            byte[] buffer = new byte[0];


            buffer = new byte[is.available()];
            is.read(buffer);
            sw.write(new String(buffer));

        } catch (Exception e) {
            return new StringWriter();
        }

        return sw;
    }
}
