package day21;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetDupli {
    public static void main(String[] args) {
        //16. You have list of numbers, determine if you have duplication there
        //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
        //ex2: [1, 2, 3] => no duplications

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
//        list.add(4);
//        list.add(4);
//        list.add(5);
//        list.add(6);

            System.out.println(list + " size:" + list.size());

            HashSet<Integer> mySet = new HashSet<>(list);
            System.out.println(mySet + " size:" + mySet.size());

            if (list.size() != mySet.size()) {
                System.out.println("has duplications");
            } else {
                System.out.println("no duplications");
            }
        int count=0;

            //tubanin kodu
//        for(int i =0; i<numbers.size();i++) {
//            for(int a=0; a<numbers.size();a++) {
//
//                if(numbers.get(i).equals(numbers.get(a)) && i!=a) {
//                    count=count+1;
//
//                }
//            }
//            if(count>=2 ) {
//                System.out.println( numbers.get(i)+ " has " + "a duplication");}
//            else
//            {System.out.println("there is not a duplication");}
//
//            count=0;


        //2.way
        System.out.println("2. way");
       // HashSet<Integer> mySet = new HashSet<>();
        for (Integer number : list) {
            if (mySet.contains(number)) {
                System.out.println("Set already has this number: " + number);
                break;
            } else {
                mySet.add(number);
            }
        }
    }
}
