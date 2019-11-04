package day20;

import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;
public class HashSetTasks {
    public static void main(String[] args) {
        //14. Write a Java program to check if a string in hash set
        // for ex: ["apple", "red", "green"]
        // if there is red => has red
        // else => dont have it
        HashSet<String> name = new HashSet<>();
        name.add("apple");
        name.add("red");
        name.add("green");

        if (name.contains("red")) {
            System.out.println("it has red");
        } else {
            System.out.println("no red");

        }


        //15. Populate you hash set with random number
        //    you hash set size must be 100
        // Hint:
        // 1. create set
        // 2. iterate 100 times
        // 3. add number to set
        Random rand = new Random();

        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = rand.nextInt(5); // 0 1 2 3 4

            mySet.add(randomNumber);
            myList.add(randomNumber);
        }

        System.out.println("myList: " + myList);
        System.out.println("mySet: " + mySet);

    }





}
