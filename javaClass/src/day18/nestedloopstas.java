package day18;

public class nestedloopstas {
    public static void main(String[] args) {
        String[][] array = {
                //0         1         2
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };

        //part1. print
        // apple lemon peach
        // red green blue
        for (int i = 0; i < array.length; i++) {
            for(int j=0; j<array[i].length;j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println(  );
        }
        System.out.println("======================");
        //part2, you have to USE 2 LOOP and print:
        // red green blue
        // apple lemon peach


//        for (int i = array.length-1; i >=0 ; i--) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i >= 0; i--) { // 0, 1
            for (int j = 0; j < array[i].length; j++) {// 0, 1, 2
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        for (int loop1 = 0; loop1 <= 2; loop1++) {  //raw
            for (int loop2 = 0; loop2 <= 1; loop2++) {  //column
                System.out.print(array[loop2][loop1] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++ ) {

                System.out.print(array[i][j] + " ");
            }
            }
        System.out.println(" ");

            }
}
