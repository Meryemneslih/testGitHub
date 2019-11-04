package day17;

public class task {
    public static void main(String[] args) {
        //using loop print multiplication table of 1
        //output:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10

        for( int i=1;i<=10;i++){
            System.out.println("1 x "+i+" = "+i);
        }
        int a=1;
        for( int i=1;i<=10;i++) {
            System.out.println(a +"x" +i + " = " + (i*a));
        }
        for( int c=1;c<=10;c++) {
            for(int b=1;b<=10;b++){
                System.out.println(c+"x" +b + " = " + (c*b));
            }
            System.out.println(" ");
        }
        // 1. write program that prints this using loops
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        for (int i = 0; i <= 5; i++) {
            for (int z = 0;  z<=i; z++)
                System.out.print("*");
            {
                System.out.println();
            }
        }
        System.out.println("PART2-------------------------------");
        for (int c = 1; c <= 10; c++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(c + " + " + b + " = " + (c + b));
            }
            System.out.println();
        }

    }
}
