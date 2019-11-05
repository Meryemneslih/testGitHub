package dayy21;

import java.util.HashMap;

public class HashMapTask {
    public static void main(String[] args) {
        // Given map, concatenate map values each time of iteration


            HashMap<String, String> map = new HashMap<>();
            map.put("A", "b");

            for (int i = 0; i < 3; i++) {
                System.out.println(map);
                //write you code here
                String value = map.get("A");

                map.put("A", value + "b" );
                //end of you code
            }
        System.out.println(map);
            //output:
            // {"A"="b"}
            // {"A"="bb"}
            // {"A"="bbb"}
        // Given map, increment map values each time of iteration

        System.out.println("===============");

            HashMap<String, Integer> map1 = new HashMap<>();
            map1.put("A", 0);

            String sentence = "ABC";
            for(char c : sentence.toCharArray()){
                System.out.println(map1);
                //write you code here

                Integer value1 = map1.get("A");
                map1.put("A", value1 + 1);


                //end of you code
            }
            //output:
            // {"A"=0}
            // {"A"=1}
            // {"A"=2}
        System.out.println("=====================");
        HashMap<Character, Integer> map2 = new HashMap<>();
        String sentence1 = "ABC";
        char[] chars = sentence1.toCharArray();//sentence.toCharArray() => ['A', 'B',' C']
        for (char c : chars) {
            //write you code here
            map2.put(c,0);
            //end of you code

        }
        System.out.println(map2);
        //output:
        // {"A"=0}
        // {"B"=0}
        // {"C"=0}
    }
}
