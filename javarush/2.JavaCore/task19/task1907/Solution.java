package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = null;
        int worldNumber = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file1 = reader.readLine();
        } catch (IOException e) {e.printStackTrace();        }

        try(FileReader fileReader = new FileReader(file1);){
            StringBuilder stringBuilder = new StringBuilder();
            while (fileReader.ready()){
                char firstChar = (char) fileReader.read();
                if(firstChar == 'w'){
                    while (Character.isAlphabetic(firstChar)){
                        stringBuilder.append(firstChar);
                        firstChar = (char) fileReader.read();
                    }
                }else {
                    while (Character.isAlphabetic(firstChar)){
                        firstChar = (char) fileReader.read();
                    }
                }
                if(stringBuilder.toString().equals("world")){
                 worldNumber++;
                }
                stringBuilder = new StringBuilder();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(worldNumber);
    }
}
