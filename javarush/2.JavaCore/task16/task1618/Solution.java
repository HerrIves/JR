package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread testT = new TestThread();
        testT.start();
        Thread.sleep(1500);
        testT.interrupt();//Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run()
        {
            try
            {
                int i = 0;
                while (!isInterrupted())
                {
                    System.out.println(i);
                    Thread.sleep(1000);
                    i++;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }
    }
}