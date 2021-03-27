package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread currentThread : threads) {
            Thread.State state = currentThread.getState();
            switch (state) {
                case NEW:
                    currentThread.start();
                    break;
                case TIMED_WAITING:
                    currentThread.interrupt();
                    break;
                case WAITING:
                    currentThread.interrupt();
                    break;
                case BLOCKED:
                    currentThread.interrupt();
                    break;
                case RUNNABLE:
                    currentThread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(currentThread.getPriority());
                    break;
            }
            //implement this method - реализуйте этот метод
        }
    }

    public static void main(String[] args) {
    }
}
