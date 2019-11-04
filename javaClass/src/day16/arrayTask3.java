package day16;

import java.util.Random;

public class arrayTask3 {
    public static void main(String[] args) {
        //TODO Task
        // part1. fill array with random values using Random/Math.random,
        // part2. print it in reverse order
        Random rand = new Random();
        int[] arr = new int[10];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            arr[i] =  (int) (Math.random() * 100);
            arr[i] = rand.nextInt(10);

            System.out.print(arr[i] + " ");

        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print("\n"+arr[i] + "");
        }
        }
    }

