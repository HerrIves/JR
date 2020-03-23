package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileStreamReader = new FileInputStream(fileNameReader.readLine());
        fileNameReader.close();

        while (fileStreamReader.available() > 0) {
            char data= (char) fileStreamReader.read();
            System.out.print(data);
        }

        fileStreamReader.close();

    }
}