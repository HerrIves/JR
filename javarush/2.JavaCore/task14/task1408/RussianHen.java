package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 0;
    }

    @Override
    String getDescription() {
        String description = String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(),Country.RUSSIA,getCountOfEggsPerMonth());

        return description;
    }
}
