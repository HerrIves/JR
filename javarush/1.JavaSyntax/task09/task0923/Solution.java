package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String gl="";
        String sgl="";

        String line =reader.readLine();

        for (int i=0;i<line.length();i++){
            if (line.charAt(i)==' '){continue;}
            else
                if (isVowel(line.charAt(i))){gl=gl+line.charAt(i)+" ";}
                else {sgl=sgl+line.charAt(i)+" ";}
        }

        System.out.println(gl);
        System.out.println(sgl);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}