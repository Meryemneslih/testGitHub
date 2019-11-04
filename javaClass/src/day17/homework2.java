package day17;

import java.util.Random;

public class homework2 {
    public static void main(String[] args) {
        //TODO
        // research on topics "Multi Dimensional Arrays", "Nested Loops"
        // Task
        // 1. Return the number of even ints in the given array.
        // {1,2,3,4,5,6} => 3
        // Hint: you need to count "even numbers"
        // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // ex1: {1,7,4,5,2} => "has 1 and 2"
        // ex2: {1,7,4,5} => "NOTHING HERE"
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
        int[] intArray = {1, 2, 3, 4, 5, 6};

        int evenCounter = 0;
        for (int i = 0; i < intArray.length; i++) {
            int currentNumber = intArray[i];
            boolean numberIsEven = currentNumber % 2 == 0;

            if (numberIsEven) {
                evenCounter++;
            }
        }

        System.out.println("you have " + evenCounter + " even numbers");
    }

}
