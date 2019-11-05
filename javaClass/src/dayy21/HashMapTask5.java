package dayy21;

import java.util.HashMap;

public class HashMapTask5 {
    public static void main(String[] args) {
        // put letters in your map, value = 0
        // if map contains that letter already print => "I have it"

            String sentence = "hello";

            HashMap<Character, Integer> letterMap = new HashMap<>();

            char[] sentenceArray = sentence.toCharArray();
            for (char letter : sentenceArray) {

                if(letterMap.containsKey(letter)){
                    System.out.println("i have it");
                }else{
                    letterMap.put(letter, 0);
                }
                System.out.println(letterMap);
            }

            // {h=0}
    }
}
