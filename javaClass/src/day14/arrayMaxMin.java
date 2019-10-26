package day14;

public class arrayMaxMin {
    public static void main(String[] args) {
        int[] myArray = {23,2,11,45,9,56};
                       //0 1  2  3  4
int min=myArray[0];
        int max=0;
        //the task is to find and print out the maximum element
        for (int i = 0 ; i<myArray.length;i++){
            int value = myArray[i];
            //myArray[i] = 2 and max = 0
            if (myArray[i] > max)
                max = myArray[i];


            if (myArray[i] <min)
                min = myArray[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
