package com.javarush.task.task18.task1812;

/* 
Расширяем AmigoOutputStream
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream Amigo;

    public QuestionFileOutputStream(AmigoOutputStream Amigo) {
        this.Amigo = Amigo;

    }

    @Override
    public void flush() throws IOException {
        Amigo.flush();
    }

    @Override
    public void write(int b) throws IOException {
        Amigo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        Amigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        Amigo.write(b, off, len);
    }

    @Override
    public void close() throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Вы действительно хотите закрыть поток? Д/Н");
            String YN = reader.readLine();
            if (YN.equals("Д")) {
                Amigo.close();
            }
        }
    }
}

