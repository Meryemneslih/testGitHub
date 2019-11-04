package day21;

import java.util.HashMap;
import java.util.Map;

public class hashMapSum {
    public static void main(String[] args) {
        //13. calculate sum of items,
        //  size of map should be at least 5

            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 100);
            map.put("Lemon", 200);
            int sum=0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            Integer value = e.getValue();
            sum += e.getValue();
        }
        System.out.println("Sum items" + sum);
            System.out.println("Sum items" + sum);
    }
}
