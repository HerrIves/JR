package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String fileName = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        }
        PrintStream consolStream  = System.out;

        ByteArrayOutputStream baoStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baoStream);
        System.setOut(printStream);

        testString.printSomething();

        FileOutputStream fOStream = new FileOutputStream(fileName);
        fOStream.write(baoStream.toByteArray());
        fOStream.flush();
        fOStream.close();
        System.setOut(consolStream);
        System.out.println(baoStream.toString());
        





    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}