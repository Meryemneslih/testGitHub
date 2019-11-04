package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class homeworkHashSet {
    public static void main(String[] args) {
       // /8. Write a Java program to convert a hash set to a tree set.
        HashSet<Integer> set= new HashSet<>();

        set.add(13);
        set.add(11);
        set.add(6);
        set.add(7);
        set.add(19);

        TreeSet <Integer> tree = new TreeSet<>(set);
        System.out.println(set);
        System.out.println(tree);

//
//
//9. Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("9================");
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);

//
//
//10. Write a Java program to compare two hash set.
        System.out.println("10==================");
        HashSet <Integer> set2=new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(12);
        set2.add(45);
        set2.add(23);
        set2.add(8);

        if(set.size()==set2.size()){
            System.out.println("they are equal");
        }else if(set.size()>set2.size()){
            System.out.println("set is grater then set2");
        }else {
            System.out.println("set2 is grater then set");
        }

//11. Write a Java program to compare two sets and retain elements which are same on both sets.

//
//
//12. Write a Java program to remove all of the elements from a hash set.
        System.out.println("12========================");
        set.clear();
        System.out.println(set);

//13. Write a Java Program to find duplications
        System.out.println("13===================");

        list.add(19);
        System.out.println(list);
        HashSet<Integer> set3=new HashSet<>(list);

        if(list.size()==set3.size()){
            System.out.println("it is not duplicate");
        }else{
            System.out.println("it is duplicate");
        }

    }
}
