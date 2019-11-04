package day19;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {



      BigInteger [] result= new BigInteger[50];
        BigInteger first = BigInteger.valueOf(1);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger c;



        for (int i = 0; i <result.length; i++) {
            c = first.add(second);
            first = second;
            second= c;


            System.out.println(c);

        }


    }
}
