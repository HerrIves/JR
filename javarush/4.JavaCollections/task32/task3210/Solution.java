package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
/*  В метод main приходят три параметра:
1) fileName - путь к файлу;
2) number - число, позиция в файле;
3) text - текст.
*/
        String text = args[2];
        long positionInFile = Long.parseLong(args[1]);

        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {

            raf.seek(positionInFile);
            byte[] readBytes = new byte[text.getBytes().length];
            raf.read(readBytes, 0, readBytes.length);

            raf.seek(raf.length());

            String message =
                    text.equals(new String(readBytes)) ?
                            "true" : "false";
            raf.write(message.getBytes());

        }

    }
}
