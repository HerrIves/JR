package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        String line;

        while(true) {
            line=reader.readLine();
            //System.out.println(line);
            writer.write(line);
            if((line.equals("exit"))){break;}
            writer.write("\n");
        }
        reader.close();
///*
        writer.close();


//*/

    }
}
