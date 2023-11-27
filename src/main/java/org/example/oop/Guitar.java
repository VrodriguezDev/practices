package org.example.oop;

public class Guitar extends Instrument implements Tuneable {

    public int strings = 6;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public String makeSound() {
        return "guitar sound";
    }

    public String makeSound(String key) {
        return "guitar sound in " + key;
    }

    @Override
    public void tune() {
        System.out.println("Guitar is tuned");
    }

    public String makeChord(String chord) {
        return chord + " chord with Guitar";
    }
}
