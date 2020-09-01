package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String fileName = null;
            try {
                 fileName = reader.readLine();
                new fileReadThread(fileName);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
        reader.close();

        }
    static class fileReadThread extends Thread{
        String file1;
        public fileReadThread(String fileName) throws IOException {
            this.file1 = fileName;
            fileRead(this.file1);

        }
        void fileRead(String file1) throws IOException {
            try(InputStream iS = new FileInputStream(file1)) {
                byte[] buff = new byte[32];
                int count = 0;
                while((count = iS.read(buff)) != -1){
                    //System.out.println(buff);

                }
            }
        }
    }
}
