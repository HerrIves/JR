package com.javarush.task.task21.task2113;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;
    public List getHorses(){return horses;}

    public Hippodrome(){}
    public Hippodrome(List horses){
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        List<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Belka", 3,0));
        horses.add(new Horse("Balka", 3,0));
        horses.add(new Horse("Bulka", 3,0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    void run() throws InterruptedException, IOException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move(){
        for (Horse h : horses) {
            h.move();
        }
    }
    void print() throws IOException, InterruptedException {
        for (Horse h : horses) {
            h.print();
            System.out.println();
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//        }
    }
    Horse getWinner(){
        Horse winner = horses.get(0);
        for (Horse h : horses) {
            if (h.distance > winner.distance)
                winner = h;
        }
        return winner;
    }
    void printWinner(){
        System.out.println("Winner is " +getWinner()+"!");
    }
}
