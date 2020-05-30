package com.javarush.task.task18.task1804;

/*
Самые частые байты
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        String path = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            path = reader.readLine();
        }
        maxRepeat(path);
    }

    static void maxRepeat(String path){
        int[][]my2Array = new int[2][255];

        try(BufferedInputStream bIStream = new BufferedInputStream(new FileInputStream(path))) {
            int currentFB =0;
            while(bIStream.available()>0){
                currentFB = bIStream.read();
                my2Array[0][currentFB] = currentFB;
                my2Array[1][currentFB]++;
                //System.out.println(my2Array[0][currentFB]+" "+my2Array[1][currentFB]);
            }
        } catch (IOException e) {e.printStackTrace(); }

        int maxBite = 254;
        for (int i=0; i<255; i++){
            if (maxBite > my2Array[1][i] && my2Array[1][i] > 0){
                maxBite = my2Array[1][i];
            }
        }
        for (int i=0; i<255; i++){
            if (maxBite == my2Array[1][i]){
                System.out.print(my2Array[0][i]+" ");
            }
        }
    }
}