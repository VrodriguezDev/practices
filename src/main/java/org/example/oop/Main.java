package org.example.oop;

public class Main {
    public static void main(String[] args) {

        Instrument guitar1 = new Guitar(6);
        Instrument guitar2 = new Guitar(6);
        Instrument bass = new Bass();

//        Tuneable guitar2 = new Guitar(6);
        Tuneable bass2 = new Bass();

        Piano piano = new Piano("Grand", "Black");
        Piano grand = new GrandPiano("White");
        Piano upright = new UprightPiano("Black");



        System.out.println(upright.getType());
    }
}