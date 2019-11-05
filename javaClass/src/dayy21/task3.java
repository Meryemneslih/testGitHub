package dayy21;

import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        //write you code here
        HashMap<String,String> map=new HashMap<>();//2.way
        for(int i=0;i<firstNames.length;i++){

         //1.way=       System.out.println(firstNames[i]+" "+lastNames[i]);
            String key = firstNames[i];
            String value = lastNames[i];
            map.put(key,value);
        }
        System.out.println(map);
        }
        //end of you code
        //System.out.println(map);
        //output:
        //{Max=Smith,Drake=Jones,Susan=Miller}


}
