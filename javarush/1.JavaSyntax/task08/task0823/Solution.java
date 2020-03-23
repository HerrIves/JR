package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Character.toUpperCase;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[]chArray=new char[string.length()];

        string.getChars(0,string.length(),chArray,0);

        for (int i=0;i<chArray.length;i++){
            if (i==0){System.out.print(toUpperCase(chArray[i]));}
            else System.out.print(chArray[i]);
            char sp=' ';
            if (chArray[i]==sp){
                System.out.print(toUpperCase(chArray[i+1]));
                i++;
            }

        }




    }
}
