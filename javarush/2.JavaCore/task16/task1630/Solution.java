package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        firstFileName = readStrLine();
        secondFileName = readStrLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fullFileName;
        String fileContentS = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;


        }

        @Override
        public void run() {
            BufferedReader sReader = null;
            try {
                sReader = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            fileContentS="";
            String fileLine="";
            try {
                while (fileLine != null) {
                    fileLine = sReader.readLine();
                    if (fileLine == null){return;}if (fileLine == null){return;}
                    fileContentS = fileContentS + fileLine;
                    fileContentS = fileContentS + " ";
                }
                sReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent(){
            return fileContentS;
        }

    }


    static String readStrLine() {
        String rString = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            rString = reader.readLine();
        } catch (IOException e) {
            System.out.println(1);
            e.printStackTrace();
        }
        return rString;
    }
}
