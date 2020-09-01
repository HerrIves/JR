package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        encript(args[0], args[1], args[2]);

    }

    static void encript(String script, String fileInput, String fileOutput) throws IOException {

        try(BufferedInputStream fileIS = new BufferedInputStream(new FileInputStream(fileInput));
            BufferedOutputStream fileOS = new BufferedOutputStream(new FileOutputStream(fileOutput));){

            switch (script){
                case "-e":
                    while (fileIS.available()>0){
                        int currByte = fileIS.read();
                        fileOS.write(++currByte);
                    }
                case "-d":
                    while (fileIS.available()>0){
                        int currByte = fileIS.read();
                        fileOS.write(--currByte);
                    }
            }
        }
    }

}
