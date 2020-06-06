package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File writefile1 = new File(reader.readLine()); //c:/temp/temp.txt
            File readfile1 = new File(reader.readLine());
            File readfile2 = new File(reader.readLine());
        reader.close();

        try(BufferedOutputStream writerf1 = new BufferedOutputStream(new FileOutputStream(writefile1));
        BufferedInputStream readerF1 = new BufferedInputStream(new FileInputStream(readfile1));
        BufferedInputStream readerF2 = new BufferedInputStream(new FileInputStream(readfile2));
        ){

            int curr = 0;
            while (readerF1.available() > 0){
                curr = readerF1.read();
                writerf1.write(curr);
                System.out.print(curr);
        }
            writerf1.flush();
            System.out.println();

            while (readerF2.available() > 0){
                curr = readerF2.read();
                writerf1.write(curr);
                System.out.print(curr);
            }

        }

    }
}
