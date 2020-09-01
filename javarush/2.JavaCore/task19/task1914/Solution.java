package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream baOStrram = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(baOStrram);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String [] baOStrramStringArray = baOStrram.toString().split(" ");
        int a = Integer.parseInt(baOStrramStringArray[0]);
        int b = Integer.parseInt(baOStrramStringArray[2]);
        String ab = baOStrramStringArray[1];

        System.out.print(baOStrramStringArray[0]+" ");
        System.out.print(baOStrramStringArray[1]+" ");
        System.out.print(baOStrramStringArray[2]+" ");
        System.out.print(baOStrramStringArray[3]+" ");
        System.out.print(ab.equals("+")?a+b:ab.equals("-")?a-b:a*b);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

