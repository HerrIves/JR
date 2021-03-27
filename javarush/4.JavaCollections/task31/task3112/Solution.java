package com.javarush.task.task31.task3112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        Path tempFile = Files.createTempFile(null,null);
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);

        Path downLoadDirectoryFile = downloadDirectory.resolve(Paths.get(url.getFile()).getFileName().toString());
        Files.createDirectories(downloadDirectory);

        return Files.move(tempFile, downLoadDirectoryFile);

    }
}