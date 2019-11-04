package day21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapCounting {
    public static void main(String[] args) {

//
        String sen=" BECOME A SOFTWARE TESTER IN 6 MONTHS";
        //1.way

        for (int i=0;i<sen.length();i++) {
            System.out.println(sen.charAt(i));

        }
        HashSet<Character> set=new HashSet<>();
        for (int i=0;i<sen.length();i++) {
            char aChar = sen.charAt(i);
            set.add(aChar);
        }
        System.out.println(set);
//part3
        // put every character in HashMap<Character, Integer>, use value 0

        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<sen.length();i++) {
            char aChar = sen.charAt(i);
            map.put(aChar,0);
        }
        System.out.println(map);
        //part4
        // when you are putting character, check if you have that character already,
        // if you have, increment value, if you dont have just add character to map

        //part5
        //print HashMap

    }
}
