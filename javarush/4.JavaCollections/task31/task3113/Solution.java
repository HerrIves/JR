package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(
                new BufferedReader(new InputStreamReader(System.in))
                .readLine());
        if ( ! Files.isDirectory(path) ){ System.out.printf("%s - не папка", path);            return;        }

        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(path, myFileVisitor);
        System.out.println(myFileVisitor);

    }
}
