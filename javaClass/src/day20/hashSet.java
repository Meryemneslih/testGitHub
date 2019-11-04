package day20;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        System.out.println("ArrayList------------------------");
       ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(1);
        listNumbers.add(1);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(1);
        setNumbers.add(1);
        System.out.println(setNumbers);
    }
}
