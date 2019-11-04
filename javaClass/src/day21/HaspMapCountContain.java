package day21;

import java.util.HashMap;
import java.util.Map;

public class HaspMapCountContain {
    public static void main(String[] args) {
        //  17. count letters in string
        // " BECOME A SOFTWARE TESTER IN 6 MONTHS"
        //17. Given map, update the values
        // Apple 333
        // Lemon 444

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 100);
            map.put("Lemon", 200);
        System.out.println(map);

        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);

        //part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500

        for (Map.Entry< String,Integer> row : map.entrySet()){
            String key = row.getKey();
            Integer value = row.getValue();

            if(key.contains("Apple")){
                map.put("Apple",500);
                System.out.println(map);

                //2.way easy way
                if(map.containsKey("Apple")){
                    map.put("Apple", 500);
                }
                System.out.println(map);
            }
        }



    }
}
