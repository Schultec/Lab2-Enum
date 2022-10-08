package lab2.cscd211classes;

import lab2.cscd211enums.Color;

public class Person implements java.lang.Comparable<Person> {

    private java.lang.String fn;    //first name
    private java.lang.String ln;    //last name
    private Color color;    //color


    public Person(String fn, String ln, Color color) {
        this.fn = fn;
        this.ln = ln;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return fn + " " + ln + ", " + color;
    }
}
