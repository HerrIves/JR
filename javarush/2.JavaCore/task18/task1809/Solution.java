package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        String file1 = null, file2 = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (IOException e) {            e.printStackTrace();        }

        readReverseWrite(file1, file2);

    }

    static void readReverseWrite(String file1, String file2) {
        ArrayList<Integer> fileArray = new ArrayList();

        try (BufferedInputStream bInStream = new BufferedInputStream(new FileInputStream(file1))) {
            while (bInStream.available() > 0) {
                fileArray.add(bInStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Collections.reverse(fileArray);
        //Integer[] fArray = fileArray.toArray(new Integer[0]);

        try (BufferedOutputStream bFOut = new BufferedOutputStream(new FileOutputStream(file2))) {
            for (int i = fileArray.size()-1; i > -1; i--) {
                bFOut.write(fileArray.get(i));
            }

        } catch (IOException e) {e.printStackTrace();        }


    }
}
