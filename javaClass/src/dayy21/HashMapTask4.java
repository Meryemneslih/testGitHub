package dayy21;

import java.util.HashMap;

public class HashMapTask4 {
    public static void main(String[] args) {
        // put letters as keys into your HashMap,
        // put value = 0

            String sentence = "hello";
        HashMap<Character, Integer> letterMap = new HashMap<>();
        char[] sentenceArray = sentence.toCharArray();
        for(char letter : sentenceArray){
            if(letter=='h') {
                letterMap.put(letter, 0);
            }

            }
        System.out.println(letterMap);
            //{h=0,e=0,l=0,o=0}


        // put only 'h' letter as keys into your HashMap,
        // put value = 0


    }
}
