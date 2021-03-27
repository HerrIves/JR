package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map param = new HashMap<String, String>();
        param.put("name", null);//"Ivanov");
        param.put("country", null);//"Ukraine");
        param.put("city", null);//"Kiev");
        param.put("age", null);

        System.out.println(     //name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
                getQuery(param)
        );
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry <String, String>entry: params.entrySet()             ) {
            if (entry.getValue() != null)sb.append(String.format("%s = '%s' and ", entry.getKey(), entry.getValue()));
        }
        if (sb.toString().equals(""))return sb.toString();
        return sb.toString().substring(0, (sb.length())-5);
    }
}
