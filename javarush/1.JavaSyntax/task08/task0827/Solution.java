package com.javarush.task.task08.task0827;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.lang.Integer.parseInt;
import static java.util.Calendar.DAY_OF_YEAR;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        //add string date to split array
        String[]subDate;
        String dev=" ";
        subDate=date.split(dev);
        //for (int i = 0; i <subDate.length; i++) {
        //    System.out.println(subDate[i]);
        //}

        //calculate month
        int month=0;
        for (int i=1;i<12;i++) {
            if (subDate[0].equals(Month.of(i).toString())){
                month=i;
            }
            //System.out.println(month+" "+Month.of(i));
        }

        //compaund
        GregorianCalendar rDate=new GregorianCalendar(parseInt(subDate[2]), month, parseInt(subDate[1]));
        boolean bRDate;
        if (rDate.get(DAY_OF_YEAR)%2==0){
            bRDate=true;}
        else bRDate=false;


        return bRDate;
    }
}
