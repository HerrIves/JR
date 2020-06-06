package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        String file1 = null;
        String file2 = null;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file1 = reader.readLine();
            file2 = reader.readLine();
        }

        byte[] file1BA = null;
        try(FileInputStream iSR = new FileInputStream(file1);) {
            file1BA = new byte[iSR.available()];
            while (iSR.available() > 0) {
                iSR.read(file1BA);
            }
        }
        try(FileOutputStream bOS = new FileOutputStream(file1);
            FileInputStream bIS= new FileInputStream(file2)){

            byte[] file2BA = new byte[(int) bIS.available()];

            while (bIS.available()>0){
                bIS.read(file2BA);
            }
            bOS.write(file2BA);

            bOS.write(file1BA);
        }




    }
}
