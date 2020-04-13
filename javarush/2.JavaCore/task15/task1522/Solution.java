package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String somePlanet = reader.readLine();
        if (somePlanet.equals("earth")) {
            thePlanet = Earth.getInstance();
        } else if (somePlanet.equals("moon")) {
            thePlanet = Moon.getInstance();
        } else if (somePlanet.equals("sun")) {
            thePlanet = Sun.getInstance();
        }else thePlanet=null;
    }
}
