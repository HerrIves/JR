package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int deep=stackTraceElements.length;
        System.out.println(deep);
        return deep; //напишите тут ваш код
    }
}

