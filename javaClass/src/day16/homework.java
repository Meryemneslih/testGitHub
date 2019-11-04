package day16;

public class homework {
    public static void main(String[] args) {
        //TODO
        // research on topics "Multi Dimensional Arrays", "Nested Loops"
        // Task
        // 1. Return the number of even ints in the given array.
        // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        int array[]={5,6,15,89,44,53,60};

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.println("even number : "+array[i]);
            }else {
                System.out.println("odd numbers :"+array[i]);
            }
        }



    }
}
