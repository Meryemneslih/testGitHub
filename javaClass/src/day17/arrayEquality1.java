package day17;

public class arrayEquality1 {
    public static void main(String[] args) {
        String[] a = {"orange", "apple", "peach"};
        String[] b = {"lemon", "apple", "peach"};

        boolean condition = true;//true yazarsak sadece true olanlara bakip yazar
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b[i])) {
                System.out.println(a[i] + "==" + b[i]);
                condition = true;
            } else {
                System.out.println(a[i] + "!=" + b[i]);
                condition = false;
                break; //if we dont put break it is going to wright every element
            }
        }

        if (condition) {
            System.out.println("arrays are same");
        } else {
            System.out.println("arrays are NOT same");
        }

    }
}
