package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consolStream = System.out;

        ByteArrayOutputStream byteBuff = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteBuff);
        System.setOut(printStream);

        testString.printSomething();

        System.setOut(consolStream);

        System.out.println(byteBuff.toString().toUpperCase());



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
