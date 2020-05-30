package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file1 = null;

            FileInputStream fIStream = null;
            try {

                while(true) {
                    file1 = reader.readLine();
                    fIStream = new FileInputStream(file1);

                    if (fIStream.available() < 1000){
                        throw new DownloadException();
                    }
                }

            }finally {fIStream.close(); }


            /*while(true) {
                file1 = reader.readLine();
                File cFile = new File(file1);
                System.out.println(cFile.length());

                if (cFile.length() < 1000){
                    throw new DownloadException();
                }
            }*/

        } catch (IOException e) {            e.printStackTrace();        }

    }

    public static class DownloadException extends Exception {
        @Override
        public String toString() {
            return "eror down";
        }
    }
}
