package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String planeMake = reader.readLine();
            int numberP = 0;

            if (planeMake.equals("helicopter")) {
                result = new Helicopter();
            } else if (planeMake.equals("plane")) {
                numberP = Integer.parseInt(reader.readLine());
                result = new Plane(numberP);
            }else System.out.println("i dont know that");
            reader.close();
        }catch (Exception e) {
            System.out.println("ERROR");;
        }
    }

        //add your code here - добавьте код тут
    }
