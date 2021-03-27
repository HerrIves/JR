package com.javarush.task.task25.task2511;

import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.TimerTask;

/* 
Вооружаемся до зубов!
*/

public class Solution extends TimerTask {
    protected TimerTask original;
    protected final Thread.UncaughtExceptionHandler handler;

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;
        this.handler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                StringWriter catchStackTraceWriter = new StringWriter();
                char[] replaceBuffer = new char[t.getName().length()];
                Arrays.fill(replaceBuffer, '*');

                catchStackTraceWriter.write(e.getMessage());
                //System.out.println(e.getMessage());
                //e.printStackTrace(new PrintWriter(catchStackTraceWriter));

                String traceMessage = catchStackTraceWriter.toString();
                System.out.println(traceMessage.replaceAll(t.getName(), String.valueOf(replaceBuffer)));
            }
        };    //init handler here
    }

    public void run() {
        try {
            original.run();
        } catch (Throwable cause) {
            Thread currentThread = Thread.currentThread();
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {
        new Thread(new Solution(new TimerTask() {
            @Override
            public void run() {
                System.out.println(1/0);
            }
        })).start();

    }
}
