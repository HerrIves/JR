package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1 считываем путь
2 читаем файл посимвольно проверяем на четность используя доп функцию\засовываем в список
3 сортируем список
4 ???
5 profit
*/

//import sun.plugin2.liveconnect.JSExceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {

    //путь к файлу

    //массив под четные числа



    public static void main(String[] args) throws Exception {
        ArrayList<Integer> intEvenArray = new ArrayList<>();


        String pathName = readPath();                                         // читаем имя файла
        nextSymb(pathName, intEvenArray);                                            // читаем файл посимвольно проверяем на четность используя доп функцию\засовываем в список
        Collections.sort(intEvenArray);                                //сортируем

        for (Integer inng : intEvenArray) {                            //выводим
            System.out.println(inng);
        }


    }

    // 1 считываем путь
    public static String readPath() throws Exception {
        String pathName;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        pathName = reader.readLine();
        reader.close();
        return pathName;

    }

    //2 читаем файл посимвольно проверяем на четность используя доп функцию\засовываем в список
    public static void nextSymb(String pathName, ArrayList<Integer>intEvenArray) throws Exception {
        FileInputStream reader = new FileInputStream(pathName);

        int nextNumb = 0;
        String stringSummChar = "";

        while (reader.available() >= 0) {

            int nextChar = reader.read();
            if (nextChar == 45) {                                      //проверка на минус
                stringSummChar = stringSummChar + "-";
                continue;
            } else {
                nextChar = Character.getNumericValue(nextChar);
            }           //конвертируем в инт для конкатенации

            if (nextChar == -1) {                                       // если не число, значит строка закончилась, смотрим что получилось

                if (!stringSummChar.equals("")) {                       // если уже посмотрели

                    nextNumb = Integer.parseInt(stringSummChar);       //конвертируем получившуюся строку в инт

                    if (returnIntEven(nextNumb) == true) {             // проверям на четность
                        intEvenArray.add(nextNumb);                    // добавляем в массив
                    }
                    stringSummChar = "";                               // обнуляем строку
                    if (reader.available() == 0) {                     // если файл кончился
                        reader.close();
                        break;
                    } else {
                        continue;
                    }
                }

            } else {
                stringSummChar += nextChar;
            }

        }
    }

    //проверяем на четность
    public static boolean returnIntEven(int nextSymb) throws Exception {

        if (nextSymb % 2 == 0) {
            return true;
        }
        return false;
    }


}
