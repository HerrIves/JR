package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static String inputString;

    public static void main(String[] args) throws IOException {
         while(true){
             inputString= inputString();
             if (inputString.equals("exit")){
             break;
             } else {
                 chooseDestiny(inputString);             }
         }
    }
///*
    public static void chooseDestiny(String someString) {

        Integer resultInt=null;
        Double resultDouble=null;

        try{ resultInt = Integer.parseInt(inputString);
            if (resultInt>0&&resultInt<128){
                short resultShort=(short)(int)resultInt;
                        print(resultShort);
            }else {
                print((Integer) resultInt);
            }
        } catch (NumberFormatException e) { //System.out.println("это не инт'");
            }

        if (resultInt==null){
            try{resultDouble = Double.parseDouble(inputString);
                print((Double) resultDouble);
            } catch (NumberFormatException e) {print(inputString);}
        }
    }

// */

    public static String inputString(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
