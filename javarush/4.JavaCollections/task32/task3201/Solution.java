package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {
/*
1) args[0]fileName - путь к файлу;
2) args[1]number - число, позиция в файле;
3) args[2]text - текст.
*/
        File inputFile = new File(args[0]);

        long writePosition = Long.parseLong(args[1]);
        byte[] text2Write = args[2].getBytes();

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(inputFile, "rw");) {
            if (writePosition > inputFile.length()) {
                writePosition = inputFile.length();
            }
            randomAccessFile.seek(writePosition);
            randomAccessFile.write(text2Write);
        }
    }
}
