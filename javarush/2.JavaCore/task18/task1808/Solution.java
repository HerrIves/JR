package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        File file1;
        File file2;
        File file3;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file1 = new File(reader.readLine());
            file2= new File(reader.readLine());
            file3= new File(reader.readLine());
        }

        readAndDevide(file1, file2, file3);
    }

    static void readAndDevide(File file1, File file2, File file3){
        long file1HalfL = 0;

        file1HalfL = file1.length() - file1.length()/2;
        //System.out.println(" file1HalfL " +file1HalfL);

        try(BufferedInputStream bRead = new BufferedInputStream(new FileInputStream(file1));
            BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream(file2));
            BufferedOutputStream bOut2 = new BufferedOutputStream(new FileOutputStream(file3));
            ){
            long readedBites = 0;
            int bytte = 0;

            while (readedBites < file1HalfL){
                bytte = bRead.read();
                bOut.write(bytte);
                        readedBites++;
                //System.out.print(" bytte "+bytte);
            }
            //System.out.println("");

            while (bRead.available() > 0){
                bytte = bRead.read();
                bOut2.write(bytte);
                //System.out.print(" bytte "+bytte);
            }

        } catch (IOException e) {e.printStackTrace();}

    }
}
