package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader is = new InputStreamReader(new FileInputStream(args[0]), "windows-1251");
             BufferedReader reader = new BufferedReader(is);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8"));
             )
        {
            while (reader.ready()){
                writer.write(reader.read());
            }
        }
    }
}
