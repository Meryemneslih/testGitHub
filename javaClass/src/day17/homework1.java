package day17;

public class homework1 {
    public static void main(String[] args) {
//                 walmart	costco	corrado's	AVG
//       apple	    3	       4	   5	     4
////    milk	   3	       3	   3	     3
////    meat	    4          5	   4	     4.33
////    bread	    1	       1	   2	     1.33
////    TOTAL	    11	      13	   14

        // given table,
        // part1. calculate sum of price in each market(walmart,costco,corrado's)
        // expected output is:
        // Total at Walmart is: ???
        // Total at costco is: ???
        // Total at corrado's is: ???

        // part2. calculate average price of each item(apple, milk, meat, bread)
        // expected output is:
        // average price of apple is: ???
        // average price of milk is: ???
        // average price of meat is: ???
        // average price of bread is: ???

        //part 1.
        int[][] price = {{3,4,5},{3,3,3},{4,5,4},{1,1,2}};

        System.out.println("Total at Walmart is : "+(price[0][0]+price[1][0]+price[2][0]+price[3][0]));
        System.out.println("Total at Costco is : "+(price[0][1]+price[1][1]+price[2][1]+price[3][1]));
        System.out.println("Total at Corrado is : "+(price[0][2]+price[1][2]+price[2][2]+price[3][2]));

        System.out.println("================================");

        System.out.println("Average price of apple is : "+((double)price[0][0]+price[0][1]+price[0][2])/price[0].length);
        System.out.println("Average price of milk is : "+((double)price[1][0]+price[1][1]+price[1][2])/price[1].length);
        System.out.println("Average price of meat is : "+((double)price[2][0]+price[2][1]+price[2][2])/price[2].length);
        System.out.println("Average price of bread is : "+((double)price[3][0]+price[3][1]+price[3][2])/price[3].length);

        System.out.println("================================");

        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {

            }

        }



    }
}
