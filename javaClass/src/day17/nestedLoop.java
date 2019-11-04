package day17;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n--------------");
        }
        //rows and columns
//*****
//*****
//*****
//*****
//*****
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("#");
            }
            System.out.println("\n--------------");
        }
    }
}
