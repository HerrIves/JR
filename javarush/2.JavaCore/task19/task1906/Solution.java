package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String file1= null;
        String file2= null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
        file1 =reader.readLine();
        file2 =reader.readLine();
        } catch (IOException e) {e.printStackTrace();}

        int curBit = 0;
        try(FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);)
        {
            while (fileReader.ready()){
                fileReader.skip(1);
                curBit = fileReader.read();
                fileWriter.write(curBit);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
