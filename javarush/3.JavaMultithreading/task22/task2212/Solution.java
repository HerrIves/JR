package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            System.err.println("wrong input");
            return false;
        }
        return telNumber.matches("\\+?\\d?\\d?\\(?\\d\\d\\d\\)?\\d\\d\\d-?\\d\\d-?\\d\\d");
    }

    public static void main(String[] args) {
        System.out.println(-21.154*15 + 523.718);

    }
}
