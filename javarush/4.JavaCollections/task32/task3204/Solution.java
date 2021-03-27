package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* 
Генератор паролей
*/

public class Solution {
    final static char[] charTable = generateCharTable();

    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        char[] password = new char[8];

        char[] strong = new char[]{0, 0, 0};

        while (!new String(strong).equals("abc")) {
            strong = new char[]{0, 0, 0};

            for (int i = 0; i < 8; i++) {
                int curCHAR = (int) (Math.random() * 62);

                if (curCHAR<10){strong[0] = 'a';}
                if (curCHAR>=10&&curCHAR<36){strong[1] = 'b';}
                if (curCHAR>=36&&curCHAR<62){strong[2] = 'c';}

                password[i] = charTable[curCHAR];

                //System.out.print(password[i]);
            }
            //System.out.println(" "+String.valueOf(strong) +"\n");

        }
        //System.out.println();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(String.valueOf(password).getBytes());
        return baos;

    }

    private static char[] generateCharTable() {
        final int ZAHLEN_NUMBER = 10;
        final int BUCH_SHIFT = 65;
        final int BUCH_NUMBER = 26;
        char[] table = new char[ZAHLEN_NUMBER + BUCH_NUMBER + BUCH_NUMBER];

        for (int i = 0; i < 10; i++) { //Numbers 10 48-57
            table[i] = (char) (i + 48);
        }
        for (int i = ZAHLEN_NUMBER; i < BUCH_NUMBER + ZAHLEN_NUMBER; i++) {//Buchscht 26 65-90
            table[i] = (char) (i + BUCH_SHIFT - ZAHLEN_NUMBER);
        }
        for (int i = 0 + ZAHLEN_NUMBER + BUCH_NUMBER; i < ZAHLEN_NUMBER + BUCH_NUMBER + 26; i++) {//Buchschtaben
            table[i] = (char) (i + BUCH_SHIFT - ZAHLEN_NUMBER - BUCH_NUMBER + 32);
        }
//        for (char c : table
//        ) {
//            System.out.print(c + " ");
//
//        }
        //System.out.println();
        return table;
    }
}
