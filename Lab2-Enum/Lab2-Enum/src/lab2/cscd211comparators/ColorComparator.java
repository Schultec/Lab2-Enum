package lab2.cscd211comparators;

import lab2.cscd211classes.Person;

import java.util.Comparator;


public class ColorComparator extends java.lang.Object implements Comparator<Person> {

    public int compare(Person p1, Person p2){
        return p1.getColor().compareTo(p2.getColor());
    }
}
