package lab2.cscd211methods;

import lab2.cscd211classes.Person;
import lab2.cscd211enums.Color;

import java.awt.image.ColorConvertOp;
import java.util.Scanner;

import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toUpperCase;

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
        int j;
        String data[] = new String[3];
        for (i = 0; i < mypeeps.length; i++){
            for  (j = 0; j < 3; j++){
                data[j] = fin.nextLine().trim();
            }
            mypeeps[i] = new Person(
                    data[0],
                    data[1],
                    convertColor(data[2])
            );
        }
        return mypeeps;
    }

    public static int menu(Scanner kb) {
        if(kb == null){
            throw new IllegalArgumentException("Bad Scanner");
        }
        
        int choice = 0;
        do
        {
            System.out.println("The menu method. Valid menu choices are:");
            System.out.println("1. Print the Array to the screen");
            System.out.println("2. Display all people that contain a certain color");
            System.out.println("3. Sort the array by Color");
            System.out.println("4. Sort the array by the 'natural order'");
            System.out.println("5. Quit");
            choice = kb.nextInt();
        }while(choice < 1 || choice > 5);
        
        return choice;
    }

    public static void printArray(Person[] myPeeps) {
        if (myPeeps == null ){
            throw new java.lang.IllegalArgumentException("array cannot be null");
        }
        int i;
        for (i = 0; i < myPeeps.length; i++){
            System.out.println(myPeeps[i] + "\r\n");
        }
    }
    public static Color convertColor(java.lang.String color){
        if (color == null){
            throw new IllegalArgumentException("string cannot be null");
        }
        Color convert = null;
        switch (color){
            case "red":
                convert = Color.RED;
                break;
            case "green":
                convert = Color.GREEN;
                break;
            case "blue":
                convert = Color.BLUE;
                break;
            case "purple":
                convert = Color.PURPLE;
                break;
        }
        return convert;
    }
    public static Color readColor(Scanner kb) {
        if (kb == null){
            throw new IllegalArgumentException("scanner cannot be null");
        }
        return convertColor(kb.nextLine());
    }

    public static void displayAll(Color toFind, Person[] myPeeps) {
        if (myPeeps == null){
            throw new java.lang.IllegalArgumentException("array cannot be null");
        }
        int i;
        for (i = 0; i < myPeeps.length; i++){
            if (myPeeps[i].getColor() == toFind){
                System.out.println(myPeeps[i]);
            }
        }
    }
}
