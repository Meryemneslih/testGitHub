package day19;

public class homework {
    public static void main(String[] args) {
       // int[] prices = new int[]{7,6,4,3,1};
        int[] prices = new int[]{1,2,3,4,5};

        //int min = prices[0];//pick any number inside the array
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
            System.out.println("p "+p);
            System.out.println("min " +min);
        }

        System.out.println("max profit :" +maxProfit);

        //tuba's code
//        int [] items= { 1,2,3,4,5};
//        int profit=0;
//
//
//        for (int i=0; i<items.length-1;i++) {
//            if(items[i+1]>items[i]) {
//
//
//
//                profit+=(items[i+1]-items[i]);
//            }
//        }
//        System.out.println(profit)
    }
}
