package day17;

public class arrayEquality {
    public static void main(String[] args) {
        // part4. check every element, if they are same print => "arrays are same"
        //ex:
        // a = {5, 6, 7}
        // b = {5, 6, 7}
        // => "arrays are same"
        //ex2:
        // a = {3, 2, 6}
        // b = {5, 6, 7}
        // => "arrays are different"
        int[] arrayA = {5, 6, 7};
        int[] arrayB = {5, 8, 7};
// way 1
//        boolean areEqual = false;
//        for(int i = 0; i < a1.length; i++){
//            if(a1[i] == b1[i]){
//                areEqual = true;
//            }else {
//                areEqual = false;
//                break;
//            }
//        }
//        int[] a1 =  {5, 8, 7};
//        int[] b1 =  {5, 6, 7};
        boolean isEqual = true;
        for (int i = 0; i < arrayA.length; i++) {
            // 1. 5 != 5 => false
            // 2. 8 != 6 => true
            if (arrayA[i] != arrayB[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual == true) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
    }
}
