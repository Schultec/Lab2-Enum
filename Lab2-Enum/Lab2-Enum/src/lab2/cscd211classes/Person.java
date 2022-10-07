package lab2.cscd211classes;

import lab2.cscd211enums.Color;

public class Person implements java.lang.Comparable<Person> {

    private Color color;    //color
    private java.lang.String fn;    //first name
    private java.lang.String ln;    //last name

    public Person(Color color, String fn, String ln) {
        this.color = color;
        this.fn = fn;
        this.ln = ln;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return fn + " " + ln + ", " + color;
    }
}
