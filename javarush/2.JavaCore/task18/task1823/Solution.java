package com.javarush.task.task18.task1823;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String inputString = reader.readLine();
            if (inputString.equals("exit")){
                break;
            }else{
                new ReadThread(inputString);
            }
        }

    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) throws IOException, InterruptedException {
            this.fileName = fileName;//implement constructor body
            fileName();
        }

        void fileName() throws IOException, InterruptedException {
            File file1 = new File(this.fileName);
            int[]bytes = new int[254];
            int maxBytes = 0;

            try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1), StandardCharsets.UTF_8));) {
                while (reader.ready()) {
                    int curByte = reader.read();
                    bytes[curByte]++;
                    //System.out.print(String.valueOf((char) curByte));
                }
            }
            for (int i = 1; i < bytes.length; i++) {
                if (bytes[i]>bytes[maxBytes]){
                    maxBytes = i;
                }
            }
            Solution.resultMap.put(this.fileName, maxBytes);
            //Thread.sleep(9000);
            //System.out.println((char)maxBytes);

        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
