package day21;

import java.util.HashMap;
import java.util.Map;

public class hashMapEx {
    public static void main(String[] args) {

        //2. Write a Java program to count the number
        //  of key-value (size) mappings in a map.
        HashMap<Integer,String> map = new HashMap<>();
    map.put(13,"Nael");
    map.put(11,"Asuman");
    map.put(7,"Nalan");

        System.out.println(map.size());
            //1.way
           HashMap<Integer,String>map2=new HashMap<>(map);
//map2=new HashMap<>(map2)
        System.out.println(map2);
        //2.way

//        HashMap<Integer,String>map3=new HashMap<>();
//
//        map3.putAll(map);
//
//        System.out.println(map3);
//
//        System.out.println("3. way with loop");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            //Hint: use .put method
            map2.put(key, value);
        }
        System.out.println("map 2: " + map2);

        System.out.println("make the map empty==");

      //  map.clear();
       // System.out.println(map.size());

        //5. Write a Java program to check whether a map
        //   contains key-value mappings (empty) or not.
        //ex: do we have key 3, print => Black,
        //                 else print => No we don't have

        int key = 1;
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else
            System.out.println("no");
//        if (map.containsKey(1)) {
//            System.out.println(map.get(1));
//        } else
//            System.out.println("no");

    if(map.isEmpty())
    {
    System.out.println("it is empty");
    }else {
    System.out.println("it is not empty");
    }
        //8. Write a Java program to test if a
        //   map contains a mapping for the specified value.


        }
}
