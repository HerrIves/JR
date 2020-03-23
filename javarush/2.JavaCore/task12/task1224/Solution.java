package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String catType="";
        if (o instanceof Cat){catType="Кот";} else
            if (o instanceof Tiger){catType="Тигр";} else
            if (o instanceof Lion){catType="Лев";} else
            if (o instanceof Bull){catType="Бык";} else
            {catType="Животное";}

                //напишите тут ваш код

        return catType;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
