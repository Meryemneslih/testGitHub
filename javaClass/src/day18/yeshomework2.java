package day18;

public class yeshomework2 {
    public static void main(String[] args) {
        boolean haveFive = false;
        for (int i = 6; i < 10; i++) {
            if (i == 5) {
                haveFive = true;
            }
        }

        if(haveFive) {
            System.out.println("you have 5 in array");
        }else {
            System.out.println("you dont have");
        }
        // part1. Given an array of ints, print "has 1" if there is a 1 in the array
        // part2. continue part1, print "has 2" if there is a 2 in the array
        // part3. continue part2, print "has 1 and 2" if there is a 1 in the array
        //                        with a 2 somewhere later in the array.
        // part3 ex1: int[] a= {1,7,4,5,2} => "has 1 and 2"

        // part3 ex2: {1,7,4,5} => "NOTHING HERE"
        // part3 ex3: {1, 1, 1, 7, 4, 5, 2, 2} => "has 1 and 2"

        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
        //

            int[] arr = {7, 4, 5, 2, 2};

            // part1
        boolean arrayHasOne = false;
        boolean arrayHasTwo = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }

        }
        if (arrayHasOne) {
            System.out.println("array has 1");
        }
        if (arrayHasTwo) {
            System.out.println("array has 2");
        }if(arrayHasOne&&arrayHasOne){
            System.out.println("array has 1 and 2");
        }


        }
}
