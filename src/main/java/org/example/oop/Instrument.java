package org.example.oop;

public abstract class Instrument {

    protected String type;

    public String makeSound() {
        Metronome met = new Metronome();
        met.doRhytm();
        return "sound";
    }

    public abstract String makeChord(String chord);

    public class Metronome {

        public void doRhytm() {
            System.out.println("Tic tac...");
        }
    }
}
