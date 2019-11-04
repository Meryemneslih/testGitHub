package day16;

public class nestedLoops {
    public static void main(String[] args) {
        System.out.println("USING LOOPS ----------------------");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }
        System.out.println("======================");
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //2.way
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//            }
//            System.out.println();
//        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //TODO Write program that prints this using loops
        //     *
        //
        //   ***
        //  ****
        // *****

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
//            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
