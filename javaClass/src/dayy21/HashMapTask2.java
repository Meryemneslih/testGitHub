package dayy21;

import java.util.HashMap;

public class HashMapTask2 {
    public static void main(String[] args) {
        // Given map, put Strings into map

            String[] names = {"Max", "Drake", "Susan"};
            HashMap<String, Integer> map = new HashMap<>();
            //write you code here
//            for(String i :names){
//                map.put(i,0);
//            }
            //end of you code
           // System.out.println(map);
            //output:
            //{"Max"=0,"Drake"=0,"Susan"=0}

        //2.way
        for(int i=0; i<names.length;i++){
            map.put(names[i],0);
        }
        //end of you code
        System.out.println(map);



    }
}
