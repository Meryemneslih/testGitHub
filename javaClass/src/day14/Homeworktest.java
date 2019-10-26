package day14;

import java.util.Scanner;

public class Homeworktest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write your numbers = ");

        int[] arr=new int[7];
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<arr.length;i++){
            arr[i] =scan.nextInt();

            if (arr[i]>max)
            max=arr[i];

            if (arr[i]<min)
                min=arr[i];

        }

        System.out.println("Maximum number : "+max);
        System.out.println("Minimum number : "+min);
    }
}
