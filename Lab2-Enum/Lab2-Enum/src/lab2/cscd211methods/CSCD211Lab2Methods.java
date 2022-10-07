package lab2.cscd211methods;

import lab2.cscd211classes.Person;
import lab2.cscd211enums.Color;

import java.util.Scanner;

public class CSCD211Lab2Methods {
    public static Person[] fillArray(Scanner fin, int total) {
        if(fin == null){
            throw new IllegalArgumentException("Scanner cannot be null");
        }
        if(total <= 0){
            throw new IllegalArgumentException("total cannot be less than 0");
        }
        Person mypeeps[];
        mypeeps = new Person[total];
        int i;
        for (i = 0; i < mypeeps.length; i++){
            String data = fin.nextLine().trim();
            String[] peopleData = data.split(",");
            mypeeps[i] = new Person(
                    Color.valueOf(peopleData[0]),
                    peopleData[1],
                    peopleData[2]
            );
        }
        return mypeeps;
    }

    public static int menu(Scanner kb) {
    }

    public static void printArray(Person[] myPeeps) {
    }

    public static Color readColor(Scanner kb) {
    }

    public static void displayAll(Color toFind, Person[] myPeeps) {
    }
}
