package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/

public class Solution extends Thread {
    UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            if (e instanceof Error) System.out.println("Нельзя дальше работать");else
            if (e instanceof Exception) System.out.println("Надо обработать");else
            if (e instanceof Throwable) System.out.println("Поживем - увидим");
        }
    };

    public Solution()  {
        setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    public static void main(String[] args) {
        System.out.println(1);
        Solution solution = new Solution();
        solution.start();
        System.out.println(3);


    }
}
