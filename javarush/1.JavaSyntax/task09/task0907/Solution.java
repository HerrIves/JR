package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        try {            //напишите тут ваш код
            int a = 42 / 0;
        }
        catch (ArithmeticException e) {
            String s = e.getMessage();
            System.out.println("ArithmeticException " +s);//напишите тут ваш код
        }
    }
}
