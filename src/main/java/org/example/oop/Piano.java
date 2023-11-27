package org.example.oop;

public class Piano extends Instrument{

    private String type;

    private String color;

    public Piano(String type, String color) {
        this.type = type;
        this.color = color;
        System.out.println("new Piano has been created " + this.type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeChord(String chord) {
        return null;
    }
}
