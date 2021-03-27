package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();

        int firstIndex = -1, secondIndex = -1;
        final char[] string2Chars = string.toCharArray();

        for (int i = 0; i < string2Chars.length; i++) {

            if (string2Chars[i] == '\t') {

                if (firstIndex == -1) {
                    firstIndex = i; }
                if (i > firstIndex) {
                    secondIndex = i;

                    return string.substring(firstIndex + 1, secondIndex);
                }
            }
        }
        throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        String str ="\tJavaRush - лучший сервис \tобучения Java\t.";
        str = getPartOfString(str);
        System.out.println(str);
    }
}
