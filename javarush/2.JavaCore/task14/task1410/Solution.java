package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Drink wine = new Wine();
        return wine;
    }

    public static Wine getWine() {
        Wine wine2 = new Wine();
        return wine2;

    }

    public static Wine getBubblyWine() {
        Wine wine3= new BubblyWine();
        return wine3;

    }
}
