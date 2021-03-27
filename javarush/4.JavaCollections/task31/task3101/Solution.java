package com.javarush.task.task31.task3101;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.*;


/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        File file = new File(args[1]);
        File newFile = new File(file.getParent() + "/allFilesContent.txt");

        FileUtils.renameFile(file, newFile);

        ArrayList<File> fileList = new ArrayList<>();
        fileListAdd(path.toFile(), fileList);


        try (OutputStream outputStream = new FileOutputStream(newFile, true);) {
            Collections.sort(fileList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
            for (File currentFile : fileList) {
                System.out.println(currentFile);
                if (currentFile.length() <= 50 && !Files.isDirectory(currentFile.toPath())) {
                    byte[] fileb = Files.readAllBytes(currentFile.toPath());
                    outputStream.write(fileb);
                    outputStream.write('\n');
                }
            }
        }
    }

    public static void fileListAdd(File file, ArrayList<File> fileList) {
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                fileListAdd(f, fileList);
            } else fileList.add(f);
        }
    }
}
