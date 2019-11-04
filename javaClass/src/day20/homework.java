package day20;

import java.util.ArrayList;
import java.util.HashSet;

public class homework {
    public static void main(String[] args) {
        //16. you have list of numbers, determine if you have duplication there
        //ex: [1, 2, 3, 4
        // , 4, 5, 6]  => has duplications
        //ex2: [1, 2, 3] => no duplications


        ArrayList<Integer> myList = new ArrayList<>();

            myList.add(1);
            myList.add(2);
            myList.add(3);
            myList.add(4);
            myList.add(4);
            myList.add(5);
            myList.add(6);

        HashSet<Integer> mySet = new HashSet<>(myList);

        if(myList.size()>mySet.size()){
            System.out.println("it has duplicate number");
        }else{
            System.out.println("it does not have duplicate number");
        }


        System.out.println("2.way=============");

//deneme
//        boolean condition = true;
//        for (int i = 0; i < myList.size(); i++) {
//            if (myList.size()==(mySet.size())) {
//                System.out.println(myList[i] + "==" + mySet[i]);
//                condition = true;

//            }
////        }
    }
}
