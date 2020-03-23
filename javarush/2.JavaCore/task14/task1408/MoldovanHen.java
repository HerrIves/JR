package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }

    @Override
    String getDescription() {
        String description = String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(),Country.MOLDOVA,getCountOfEggsPerMonth());

        return description;
    }
}
