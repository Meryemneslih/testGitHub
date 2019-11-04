package day21;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HomeWorkHashMap {
    public static void main(String[] args) {
        //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Nael",13);
        map.put("Asuman",11);
        map.put("Nalan",6);

        for (Map.Entry<String,Integer> i: map.entrySet()){
            System.out.println(i.getKey()+"  "+i.getValue());

        }


//2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("2=====================");
        System.out.println(map.size());

//
//3. Write a Java program to copy all of the mappings from the specified map to another map.
        System.out.println("3=======================");
        HashMap<String,Integer> map2=new HashMap<>(map);
        System.out.println(map2);
//
//4. Write a Java program to remove all of the mappings from a map.
        System.out.println("4=======================");
        map.clear();
        System.out.println(map);
//
//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("5======================");
        if(map.isEmpty()){
            System.out.println("it is empty");
        }else{
            System.out.println("it is not empty");
        }
//
//6. Write a Java program to get a shallow copy of a HashMap instance.
        System.out.println("6======================");
      map = map2;
        System.out.println(map);

//
//7. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("7=========================");
        if(map.containsKey("Nalan")){
            System.out.println("it has Nalan");
        }else{
            System.out.println("it doesn't have");
        }
//
//8. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("8==================");
        if(map.containsValue(13)){
            System.out.println("it has 13");
        }else{
            System.out.println("it doesn't have");
        }
//
//9. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println("9=====================");
        System.out.println(map.entrySet());
//
//10. Write a Java program to get the value of a specified key in a map.
        System.out.println("10================");
        Integer key= map.get("Nael");
        System.out.println(key);

//
//11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("11==================");
        System.out.println(map.keySet());
//
//12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("12================");
        System.out.println(map.values());
    }
}
