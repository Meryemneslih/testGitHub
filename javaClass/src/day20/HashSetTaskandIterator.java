package day20;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTaskandIterator {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified
        // element to the end of a hash set.
        // ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]
        HashSet <Integer> Numbers = new HashSet<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(10);

        Numbers.add(5);
        Numbers.add(5);
        Numbers.add(5);
        Numbers.add(5);
        Numbers.add(5);

        System.out.println(Numbers.size());


        System.out.println("1. way ------------------------------");
        for (Integer number : Numbers) {
            System.out.println(number);
        }

        System.out.println("\n2. way ------------------------------");
        Iterator<Integer> iterator = Numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
        System.out.println("making empty=======");
        //1.way
//        Numbers.removeAll(Numbers);
//
//        System.out.println(Numbers);
        //2.way
//        Numbers.clear();
//        System.out.println(Numbers);

        System.out.println("remove only some elements====");
        HashSet<Integer>Numbers2= new HashSet<>();
        Numbers2.add(1);
        Numbers2.add(2);

        Numbers.removeAll(Numbers2);
        System.out.println(Numbers);

        System.out.println("is it empty=====");

        System.out.println(Numbers.isEmpty());
        System.out.println("=================");
        if(Numbers.isEmpty()){
            System.out.println("it is empty");
        }else{
            System.out.println("it is not empty");
        }


        Integer[] array = new Integer[Numbers.size()];
        Numbers.toArray(array);


        System.out.println("Array elements: ");
        for(Integer element : array) {
            System.out.println(element);


        }
    }
}
