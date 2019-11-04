package day17;

public class multiDimensionalArrayTask {
    public static void main(String[] args) {
        // Create 2D array
        // in first row put names
        // in second row put surnames


        String [][] name= {{"Nail","Asuman","Nalan"},{"Atasoy","Zengince","Ates" } };

        System.out.println(name [0][0] + " " + name [1][0]);
        System.out.println("1-------------------------");
        for (int i = 0; i < name[0].length; i++) {
            System.out.println(name[0][i] + " " + name[1][i]);
        }
//        }for(int i=0;i<arr[0].length;i++){
//            for(int j=0;j<arr.length;j++ ){
//
//                System.out.print(arr[j][i]+" ");
//
//            }
//            System.out.println();
//        }
        System.out.println("2--------------------");

        for (int i = 0; i < name[0].length; i++) {
            for (int j = 0; j < name.length; j++) {
                System.out.print(name[j][i] + " ");

            }
            System.out.println();

        }


    }
}
