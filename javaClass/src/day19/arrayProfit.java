package day19;

public class arrayProfit {
    public static void main(String[] args) {
        //        we need to use
//        use for loop
        //find out min number
        //found Max between max and price - min.
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        //int min = prices[0];//pick any number inside the array
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
            System.out.println("p "+p);
            System.out.println("min "+min);
        }

        System.out.println(maxProfit);


//        for (int p = 0; p < prices.length; p++) {
////            System.out.println(prices[p]);
//            System.out.println(p);
    }
}
