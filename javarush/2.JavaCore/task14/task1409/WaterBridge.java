package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 1;
    }
    public String toString() {
        return ""+ getCarsCount();
    }
}
