package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null)
            throw new TooShortStringException();

        String[] stringsArray = string.split(" ");
            if (stringsArray.length < 5)
                throw new TooShortStringException();

        String result = stringsArray[1];

        for (int i = 2; i < 5; i++) {
            result = result + " " + stringsArray[i];
        }
        return result;
    }

    public static class TooShortStringException extends RuntimeException{ }
}
