package day18;

public class homework {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 2, 2};
        boolean arrayHasTwo = false;
        boolean arrayHasOne = false;
        boolean arrayhasoneandtwo= false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }

        }

        if (arrayHasOne) {
            System.out.println("array has 1");

        }

        if (arrayHasTwo) {
            System.out.println("array has 2");
        }
        arrayhasoneandtwo = arrayHasOne && arrayHasTwo;
        if (arrayhasoneandtwo) {
            System.out.println("array has both numbers");
        }
    }
}
