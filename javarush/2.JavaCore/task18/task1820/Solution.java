package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        File fileRead = null;
        File fileWrite = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileRead = new File(reader.readLine());
            fileWrite = new File(reader.readLine());
        }
            try (BufferedReader readFStream = new BufferedReader(new InputStreamReader(new FileInputStream(fileRead)));
             BufferedWriter writeFStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileWrite)));
        ) {
            for (int i = 0; i < (int) fileRead.length(); ) {  // читаем файл до конца файла
                StringBuffer stringBuffer = new StringBuffer();
                char currCh = 0;                               // текущий символ
                while (true) {
                    currCh = (char)readFStream.read();

                    if (i == fileRead.length()) {             // конец пути!
                        break;
                    }
                    i++;

                    if (currCh == ' ') {                      // конец флоата
                        break;
                    }
                    stringBuffer.append(currCh);
                }
                System.out.print(stringBuffer);

                int result = Math.round(Float.parseFloat(String.valueOf(stringBuffer)));
                System.out.println(result);

                writeFStream.write(String.valueOf(result));
                writeFStream.write(' ');
            }
        }
    }
}
