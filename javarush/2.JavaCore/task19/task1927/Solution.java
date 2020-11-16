package com.javarush.task.task19.task1927;

import java.io.*;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream saveOut = System.out;
        ByteArrayOutputStream bAOStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(bAOStream);
        System.setOut(printStream);

        testString.printSomething();

        System.setOut(saveOut);
        boolean zeig = true;
        for (String str: bAOStream.toString().split("\n")){
            System.out.println(str);
            zeig = !zeig;
            if (zeig == true){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

public static class TestString {
    public void printSomething() {
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
        System.out.println("fourth");
        System.out.println("fifth");
    }
}
}
