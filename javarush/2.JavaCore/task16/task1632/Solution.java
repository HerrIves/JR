package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {
        threads.get(4).start();
    }

    static class MyThread1 extends Thread{
        public MyThread1(){
            super("MyThread1");
        }

        public void run(){
                while (true){
                int i=0;
                i++;
                }
        }

    }

    static class MyThread2 extends Thread {
        public MyThread2() {
            super("MyThread2");
        }

        public void run() {
            try {
                while (true) {
                    sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class MyThread3 extends Thread{
        public MyThread3(){
            super("MyThread3");
        }

        public void run(){
            try {
                while (true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class MyThread4 extends Thread implements Message{
        public MyThread4(){
            super("MyThread4");
        }

        public void run(){
            try {
                while (true) {
                    sleep(500);
                    System.out.println("Ура");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void showWarning() {
            interrupt();
            System.out.println("Warning");
        }
    }

    static class MyThread5 extends Thread{
        public MyThread5(){ super("MyThread5");}

        int readAndSumm(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String numbS = "";
            int numbI = 0;

            try {
                while (true) {
                    numbS = reader.readLine();
                    if (numbS.equals("N")){break;}
                    try{
                        numbI += Integer.parseInt(numbS);
                    } catch (NumberFormatException e) {
                        System.out.println("для выхода нажмите N");
                    }
                }
            }catch (IOException e) {}
            return numbI;
        }

        public void run(){
            int numb = readAndSumm();
            System.out.println(numb);
        }
    }

}