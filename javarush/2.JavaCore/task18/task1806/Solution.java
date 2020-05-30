package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/temp/temp.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/temp/temp2.txt");

        byte[] buffer = new byte[inputStream.available()];
        int count = 0;
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            count = inputStream.read(buffer);
            System.out.println(count);

            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
