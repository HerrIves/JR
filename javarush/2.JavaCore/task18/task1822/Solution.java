package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputLine = args[0];
        File file1 = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            file1 = new File(reader.readLine());
        }


        try(BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));){

            while (bReader.ready()){
            String fLine = bReader.readLine();
            String idSubLine = fLine.split(" ")[0];

            if (idSubLine.equals(inputLine)){
                System.out.println(fLine);
                break;
            }
            }
        }



    }
}
