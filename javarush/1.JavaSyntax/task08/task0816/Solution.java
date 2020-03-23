package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Саллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стaлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стaлне", dateFormat.parse("MAY 1 2012"));
        map.put("Стaллое", dateFormat.parse("MAY 1 2012"));
        map.put("Стaллон", dateFormat.parse("MAY 1 2012"));
        map.put("Сллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Стaоне", dateFormat.parse("MAY 1 2012"));


        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String,Date>>itr=map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Date>entry=itr.next();
            String key=entry.getKey();
            Date value=entry.getValue();
            if (value.getMonth()>=5&&value.getMonth()<=7){
                itr.remove();
            }
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) {
/*        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date date=dateFormat.parse("MAY 1 2012");

    Date date=new Date();
    int month=date.getMonth();
        System.out.println(month);
*/
    }
}
