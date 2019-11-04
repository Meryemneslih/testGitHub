package day16;


import java.util.Arrays;
import java.util.Random;

public class arraysTask5 {
    public static void main(String[] args) {
        //TODO
        // Given 2 arrays of ints, a and b, print "have the same first elements"
        //       if they have the same first element
        // part2. if they have the same last element print => "have the same last elements"
        // part3. if they have the same middle element print => "have the same middle elements"
        Random random = new Random();

       /* int[] a = new int[3];
        int[] b = new int[3];

            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(10);
                System.out.println("a : " + a[i]);
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = random.nextInt(10);
                System.out.println("b :" + b[i]);
            }
            if (a[0] == b[0]) {
                System.out.println("first elements are equal");
            } else {
                System.out.println("first elements are not equal");
            }


            int lengthOfA = a.length; //5
            int lengthOfB = b.length; //3
            if (a[lengthOfA - 1] == b[lengthOfB - 1]) { // a[5]
                System.out.println("have the same last elements");
            }
            //part 3
            System.out.println("Part3------------------------");
            if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
                System.out.println("have the same middle elements");
            }
           */

//        int[] a = {10, 20, 25, 55};
//        int[] b = {10, 60, 30, 23, 99, 100};
//
//        //part 1
//        if (a[0] == b[0]) {
//            System.out.println("have the same first elements");
//        }

        int[] a = {10, 60, 30}; // length = 6
        //          0   1   2
        int[] b = {10, 60, 30}; //length = 3 => 3-1 =>2
        //part 1
        System.out.println("Part1------------------------");
        if (a[0] == b[0]) {
            System.out.println("have the same first elements");
        }
        //part 2
        System.out.println("Part2------------------------");
        int lengthOfA = a.length; //6-1 =>5
        int lengthOfB = b.length; //3
        if (a[lengthOfA - 1] == b[lengthOfB - 1]) {
            System.out.println("have the same last elements");
        }
        //part 3
        System.out.println("Part3------------------------");
        if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
            System.out.println("have the same middle elements");
        }
        if (Arrays.equals(a,b)){
            System.out.println("arrays are equal");
        }else{
            System.out.println("arrays are not equal");
        }


    }
}
