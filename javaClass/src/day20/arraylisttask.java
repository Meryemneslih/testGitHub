package day20;
import java.util.ArrayList;
import java.util.Collections;

public class arraylisttask {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList();
        colors.add("red");
        colors.add("white");
        colors.add("black");
        colors.add("green");
        System.out.println(colors);
        System.out.println("1.way======");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
            System.out.println("2.way============");
            //for-each
            for (String color : colors) {
                System.out.println(color);
            }
        }
            System.out.println("3.way==============");
            //.forEach method
            colors.forEach(color -> System.out.println(color));


            colors.add(0, "yellow");
            System.out.println(colors);
            System.out.println("==================");
            System.out.println(colors.get(3));
        System.out.println("=======================");
        colors.set(2,"blue");
        System.out.println(colors);
        System.out.println("========================");

        colors.remove(2);
        System.out.println(colors);
        System.out.println("==========================");
       if(colors.contains("black")){
           System.out.println("it has black color");
       }else{
           System.out.println("it doesn't have black color");
       }
        System.out.println("=========================");

       Collections.sort(colors);
        System.out.println(colors);

        System.out.println("===========================");

        ArrayList<String>list2=new ArrayList<>();

        for(String element : colors){
            System.out.println(element);
            list2.add(element);

        }




    }
    }