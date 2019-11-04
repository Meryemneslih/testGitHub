package day17;

import java.util.Random;

public class homework {
    public static void main(String[] args) {
        //TODO Using 2D Array fill the table of exam(examresult array)
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

        ///part1. give number
        int[][] examResult = {
                {10,40,45},
                {99,70,60},
        };
        for (int i = 0; i < examResult.length; i++) { // rows
            for (int b = 0; b < examResult[i].length; b++) { // columns
                System.out.println( examResult[i][b]);
            }
            System.out.println();
            
        }
        System.out.println("--------------------------");

//        Random rndm=new Random();
//        int [][] result= new int[5][5];
//
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.println( examResult[i][j]);
//
//            }
//            }
            


        
        

    }
}
