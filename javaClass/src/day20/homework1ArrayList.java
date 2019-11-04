package day20;

import java.util.Collections;
import java.util.ArrayList;
public class homework1ArrayList {
    public static void main(String[] args) {
        //10. Write a Java program to shuffle elements in a array list.
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println("List before shuffling:\n" + list);
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n" + list);

        System.out.println("12=============================");
        //12. Write a Java program to extract a portion of a array list.
        list.remove("Red");
        list.remove(3);

        System.out.println("After extract :"+list);
        //
        //13. Write a Java program to compare two array lists.
        System.out.println("13========================");

        ArrayList<String> list2= new ArrayList<>();

        list2.add("apple");
        list2.add("grapes");
        list2.add("banana");
        list2.add("chery");

        if(list.size()==list2.size()){
            System.out.println("they are equals");
        }else if(list.size() > list2.size()){
            System.out.println("list is grader than list2");
        }else{
            System.out.println("list2 is grader than list");
        }

        //14. Write a Java program of swap two elements in an array list.
        System.out.println("14========================");

        System.out.println(list2);
        Collections.swap(list2,1,2);

        System.out.println(list2);

        //
        //
        //15. Write a Java program to join two array lists.
        System.out.println("15=========================");
        list.addAll(list2);
        System.out.println("list is here : "+list);
        System.out.println("list2 is here : "+list2);
        //
        //
        //16. Write a Java program to clone an array list to another array list.
        System.out.println("16=========================");

        ArrayList<String> newList = (ArrayList<String>)list.clone();

        System.out.println("new list :"+newList);

        //
        //
        //17. Write a Java program to empty an array list.

        System.out.println("17=====================");

        list.clear();

        System.out.println(list);
        //
        //
        //18. Write a Java program to test an array list is empty or not.
        System.out.println("18==============================");
        if(list.isEmpty()){
            System.out.println("it is empty");
        }else{
            System.out.println("it is not empty");
        }
        //
        //
        //19. Write a Java program to trim the capacity of an array list the current list size.
        System.out.println("19=========================");
        System.out.println(list2);
        list2.trimToSize();
        System.out.println(list2);
        //
        //
        //20. Write a Java program to increase the size of an array list.
        System.out.println("20=========================");

        list2.ensureCapacity(5);
        System.out.println(list2);
        //
        //
        //21. Write a Java program to replace the second element of a ArrayList with the specified element.

        System.out.println("21==========================");

        list2.set(2,"orange");
        System.out.println(list2);
        //
        //
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

        System.out.println("22============================");

        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i)+"  "+i);
        }
    }
}
