package com.javarush.task.task22.task2209;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        while (fileReader.ready()) {
            words.addAll(Arrays.asList(fileReader.readLine().split(" ")));
        }
        fileReader.close();
        //...

        StringBuilder result = getLine(words.toArray(new String[words.size()]));

        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) return new StringBuilder();

        StringBuilder sb = new StringBuilder(words[0] + " ");
        words[0] = null;                                        //обнуляем каждый элемент массива для избежания повторов
        int quantity = 1;                                       //считаем количество собранных слов

        while (quantity < words.length) {                       //повторяем пока все слова не будут собраны
            for (int i = 1; i < words.length; i++) {
                String curWord = words[i];
                if (curWord == null) continue;

                char lastCurChar = curWord.toUpperCase().charAt(curWord.length() - 1);
                char firstSbChar = sb.charAt(0);
                if (lastCurChar == firstSbChar) {
                    sb.insert(0, curWord + " ");
                    words[i] = null;
                    quantity++;
                } else {
                    char firstCurChar = curWord.toLowerCase().charAt(0);
                    char lastSbChar = sb.charAt(sb.length() - 2);
                    if (firstCurChar == lastSbChar) {
                        sb.append(curWord + " ");
                        words[i] = null;
                        quantity++;
                    }
                }
//                System.out.println(sb.toString());
            }
        }
        return sb.deleteCharAt(sb.length()-1); // Амстердам Мельбурн Нью-Йорк Киев Вена
    }
}

