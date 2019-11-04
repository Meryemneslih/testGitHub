package day18;

public class HWBayrambey {
    public static void main(String[] args) {
        int [] arr={7,8,1,4,5,2,2,2,1};
        int count1 = 0;
        int count2 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1) {
                count1++;
            }
            if (arr[j] == 2) {
                count2++;
            }
        }
        int comp=count1*count2;
        System.out.println(comp);
        if(comp!=0){
            System.out.println(" has 1 and 2");
        }
        else{
            System.out.println(" nothing here");
    }
    }
}
