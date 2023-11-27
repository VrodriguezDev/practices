package org.example.oop;

public class Bass extends Instrument implements Tuneable{

    @Override
    public String makeSound() {
        return "bass sound";
    }

    @Override
    public String makeChord(String chord) {
        return null;
    }

    @Override
    public void tune() {
        System.out.println("Guitar is tuned");
    }
}
