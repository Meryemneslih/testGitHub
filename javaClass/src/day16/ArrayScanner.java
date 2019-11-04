package day16;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        //TODO
        //part1. using scanner fill array of length 10;
        //part2. print reverse of you array
        // 1 2 3 4 5 6 7 8 9 10
        // 10 9 8 7 6 5 4 3 2 1

            Scanner scan = new Scanner(System.in);
            int[] arr =  new int[3];

            for(int i=0;i<arr.length;i++) {
                System.out.println("Provide your number : "+i);
                arr[i] = scan.nextInt();
            }
        System.out.println("normal");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //HINT Part2:
        // start from length()-1
        // use i-- to decrement
        System.out.println("Array Length: " + arr.length);

        // 0: 10
        // 1: 20
        // 2: 30
        System.out.println("reverse");
        // assume array length is 3
        // and index: 0 1 2
        // reverse: 2 1 0
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            // i = 2; arr[2]
            // i = 1; arr[1]
            // i = 0; arr[0]
            // i = -1; exit the loop
        }
    }
}
