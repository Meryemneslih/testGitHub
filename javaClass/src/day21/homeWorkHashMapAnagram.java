package day21;

import java.util.Arrays;

public class homeWorkHashMapAnagram {
    public static void main(String[] args) {
//Given to strings s and t Write a java program to determine if t is an anagram of s
        //input s:anagram   , t=nagaram

        String s = "anagram";
        String  t= "nagaram";

        char[] c = s.toCharArray();
        System.out.println(c);
        Arrays.sort(c);
        System.out.println(c);

        char[] d = t.toCharArray();
        System.out.println(d);
        Arrays.sort(d);
        System.out.println(d);

        boolean b=true;
        for(int i=0;i<d.length;i++) {
            if (c[i] == d[i]) {
                b=true;
                System.out.println(b);
                break;

            }

//            boolean isEqual = true;
//            for (int i = 0; i < arrayA.length; i++) {
//                // 1. 5 != 5 => false
//                // 2. 8 != 6 => true
//                if (arrayA[i] != arrayB[i]) {
//                    isEqual = false;
//                    break;
//                }



        }



    }
}
