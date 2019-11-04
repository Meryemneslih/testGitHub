package day18;

public class yesHomeWork {
    public static void main(String[] args) {

            String[] stringNumbers = new String[15];
            for (int i = 0; i < stringNumbers.length; i++) {
                stringNumbers[i] = "" + i;
                // stringNumbers[0] = "0"
                // stringNumbers[1] = "1"
                // ...
                // stringNumbers[14] = "14"
            }
            String stringSum = "";
            for (String s : stringNumbers) {
                stringSum += s + " ";
            }
            System.out.println("StringConcatenate: " + stringSum);

            int[] intNumbers = new int[15];
            for (int i = 0; i < intNumbers.length; i++) {
                intNumbers[i] = Integer.valueOf(stringNumbers[i]);
            }

            int intSum = 0;
            for (int n : intNumbers) {
                intSum += n;
            }
            System.out.println("IntSum: " + intSum);

        }
}
