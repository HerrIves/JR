package com.javarush.task.task17.task1721;

import java.io.IOException;

public class CorruptedDataException extends IOException {
    String laja = "хуйня, переделывай";
    @Override
    public String toString() {
        return laja;
    }
}
