package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;

    public LoggingStateThread(Thread thread) throws InterruptedException {
        this.thread = thread;
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(state);
        while (thread.getState() != State.TERMINATED) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (state != thread.getState()) {
                state = thread.getState();
                System.out.println(state);
            }
        }
    }
}
