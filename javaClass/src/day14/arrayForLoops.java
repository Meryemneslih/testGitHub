package day14;

public class arrayForLoops {
    public static void main(String[] args) {
        int[] arr = {2, 11, 45, 9};

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
