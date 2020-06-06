package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));){

        int result = 0;
        while (reader.ready()){
            //for (int i = 64; i < 124; i++) {

            int currentCh = reader.read();
            //System.out.print(currentCh+" ");
            //System.out.println((char)currentCh);
            if ((currentCh>='a'&&currentCh<='z')||(currentCh>='A'&&currentCh<='Z')){
                result++;
            }
        }

        System.out.println(result);
    }
    }
}
