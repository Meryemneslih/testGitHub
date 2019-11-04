package OfficeHourArrays;

public class officehourArraySum {
    public static void main(String[] args) {
        //         walmart  costco  corrado's  AVG
//    apple  3         4     5       4
//    milk  3         3     3       3
//    meat  4          5     4       4.33
//    bread  1         1     2       1.33
//    TOTAL  11        13     14

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


            int[][] prices = {
                    {3, 4, 5, 5},//apple => (3+4+5+5) / 4 = 4.25 (AVG)
                    {3, 3, 3, 5},//milk => (3+3+3+5) / 4 = 3.5 (AVG)
                    {4, 5, 4, 3},//meat => (4+5+4+3) / 4 = 4.0 (AVG)
                    {4, 5, 4, 3},//bread => (4+5+4+3) / 4 = 4.0 (AVG)
                    {1, 1, 2, 34}//pepsi => (1+1+2+34) / 4 = 9.5 (AVG)
                    //sum=15,18,18, 50
                    //wal,costco,corrado,amazon

                    // prices[i][j]
                    // prices[0][0] 3 , prices[0][1] 4 , prices[0][2] 5 , prices[0][3] 5 ,
                    // prices[1][0] 3 , prices[1][1] 3 , prices[1][2] 3 , prices[1][3] 5 ,
                    // prices[2][0] 4 , prices[2][1] 5 , prices[2][2] 4 , prices[2][3] 3 ,
                    // prices[3][0] 4 , prices[3][1] 5 , prices[3][2] 4 , prices[3][3] 3 ,
                    // prices[4][0] 1 , prices[4][1] 1 , prices[4][2] 2 , prices[4][3] 34,
            };

            // double[] sumItemArr = new double[5];//prices.length
            // double[] avgArr = new double[5];//prices.length


            double[] sumItemArr = new double[prices.length];
            double[] avgArr = new double[prices.length];

            double[] sumMarket = new double[4];//prices[0].length

            for(int urun = 0; urun<prices.length;urun++) {
                //System.out.println("prices.length = " +  prices.length); //5
                //System.out.println("urun = " + urun);
                for(int mar = 0; mar<prices[urun].length;mar++) { //4
                    //System.out.println("mar = " + mar);
                    //System.out.println("prices["+i+"].length = " +  prices[i].length);
                    sumItemArr[urun] += prices[urun][mar];
                    //System.out.println("sumItemArr[urun] = " + sumItemArr[urun]);
                    sumMarket[mar] += prices[urun][mar];
                    //System.out.println("sumMarket[mar] = " + sumMarket[mar]);
                }
                avgArr[urun] = sumItemArr[urun] / 4; //prices[0].length
            }


          //  System.out.println("sumMarket = "+Arrays.toString(sumMarket));

            //System.out.println("sumArr = "+Arrays.toString(sumItemArr));
          //  System.out.println("avgArr = "+Arrays.toString(avgArr));



            String[] stores = {"Walmart", "Costco", "Corrados", "amazon"};
            String[] items = {"apple", "milk", "meat", "bread", "pepsi"};

            for(int i = 0; i< items.length; i++) {
                System.out.println("AVG of "+items[i]+" = " + avgArr[i]  );
            }

            for(int j = 0; j < stores.length; j++) {
                System.out.println("SUM of " + stores[j] + " = " + sumMarket[j]);
            }


            int[][] prices2 = {
                    new int[]{3, 4, 5, 5},
                    new int[]{3, 3, 3, 5},
                    new int[]{4, 5, 4, 3},
            };
            //you have to put the size
            int[][] price3 = new int[3][5];
            int check = prices[4].length;



//        int[] storeSum = new int[prices[0].length];
//        int[] itemAvg = new int[prices.length];
        System.out.println("AVG--------------------------------");
        for (int row = 0; row < prices.length; row++) {
            System.out.println("prices.length = "+prices.length);
            double sum = 0;
            for (int col = 0; col < prices[row].length; col++) {
                sum += prices[row][col];
            }
            double avg = sum / prices[row].length;
            System.out.println(items[row] + " avg: " + avg);
        }

        System.out.println("SUM--------------------------------");
        for (int j = 0; j < prices[0].length; j++) { //marketlerdeki degerleri gezmis oluyorum  4 marketim var
            double sum = 0;
            for (int i = 0; i < prices.length; i++) {
                sum += prices[i][j];
            }
//            System.out.println(stores[j] + " sum: " + sum);
//            System.out.println("sumMarket = "+Arrays.toString(sumMarket));
//            System.out.println("********************************************");
//            System.out.println(sumMarket);
//            System.out.println(Arrays.toString(sumMarket));
//            System.out.println("*
//        }
    }
    }
}
