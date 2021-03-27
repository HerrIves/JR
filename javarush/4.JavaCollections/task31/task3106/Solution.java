package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Path zipFilePath = fileHarvest(args);

        Path unZipFilePath = Paths.get(args[0]);

        fileUnzip(zipFilePath, unZipFilePath);

    }

    public static Path fileHarvest(String...strings) throws IOException {
        Path fileHarvestedPath = Files.createTempFile(null,null);

        for (int i = 1; i < strings.length; i ++){
            Files.write(fileHarvestedPath, Files.readAllBytes(Paths.get(strings[i])), StandardOpenOption.APPEND);
        }
        return fileHarvestedPath;
    }

    public static void fileUnzip(Path zipPath, Path unzipPath) throws IOException {
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(zipPath.toFile()));){
            ZipEntry entry;
            String name;
            long size;

            while((entry = zis.getNextEntry()) != null){
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s \t File size %d \n", name, size);

                OutputStream fos = new BufferedOutputStream(new FileOutputStream(unzipPath.toString()));
                while (zis.available() > 0) {
                    fos.write(zis.read());
                }
                fos.flush();
                zis.closeEntry();
                fos.close();
            }
        }
    }
}
