package day21;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMaptask4 {
    //14. print
    // Apple Lemon Peach Melon Berry
    // 100 200 150 145 250
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            String entryKey = entry.getKey();
            System.out.print(entryKey+"  ");
        }
        System.out.println();

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            Integer entryValue = entry.getValue();

            System.out.print(entryValue + "  ");


        }
        System.out.println("========================");
        //2.way
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
        //15. given map, print it like this:
        // Apple 100
        // Lemon 200
        // Peach 150
        // Melon 145
        // Berry 250
        System.out.println("============================");
        for (Map.Entry< String,Integer> row : map.entrySet()) {
            String key = row.getKey();
            Integer value = row.getValue();

            System.out.println(key+" "+value);

        }



    }
}
