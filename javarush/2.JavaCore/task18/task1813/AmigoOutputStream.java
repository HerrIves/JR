package com.javarush.task.task18.task1813;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fOS;
    public AmigoOutputStream(FileOutputStream fOS) throws FileNotFoundException {
        super(fileName);
        this.fOS = fOS;
    }

    @Override
    public void close() throws IOException {
        fOS.flush();
        String gB = "JavaRush © All rights reserved.";
        byte[] gBA = gB.getBytes();
        fOS.write(gBA);
        fOS.close();
    }

    @Override
    public void write(int b) throws IOException {
        fOS.write(b);
    }

    @Override
    public void flush() throws IOException {
        fOS.flush();
    }

    @Override
    public void write(byte[] b) throws IOException {
        fOS.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fOS.write(b, off, len);
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }

}
