package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {        void move();    }

    //может быть съеден
    public interface Edible {        void beEaten();    }

    //может кого-нибудь съесть
    public interface Eat {        void eat();    }

    abstract class Cat implements Movable,Edible,Eat{}
    abstract class Mouse implements Movable,Edible{}
    abstract class Dog implements Movable,Edible,Eat{}
}