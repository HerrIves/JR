package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    int fileNumber;
    int directoriesNumber;
    long commonSize;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        fileNumber++;
        commonSize+= Files.size(file);
        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        directoriesNumber ++;
        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public String toString() {
        return "Всего папок - "+(directoriesNumber-1)+"\n"+
                "Всего файлов - "+fileNumber+"\n"+
                "Общий размер - "+commonSize;
    }
}
