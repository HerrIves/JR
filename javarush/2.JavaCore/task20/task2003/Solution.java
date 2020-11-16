package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        for (Map.Entry<String, String> entry: runtimeStorage.entrySet()             ) {
            outputStream.write(entry.toString().getBytes());
        }//напишите тут ваш код
    }

    public static void load(InputStream inputStream) throws IOException {
        BufferedReader breader = new BufferedReader(new InputStreamReader(inputStream));

        while (breader.ready()){
            String key = breader.readLine();
            String value = breader.readLine();
            runtimeStorage.put(key, value);
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
