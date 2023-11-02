package Arrays;

public class ArrayIndividualIncrement {
    public static void main(String[] args) {
        int[] arr = {23,45,67,43,5};

        System.out.println("printing array for the first time ");

        for(int temp : arr){
            System.out.println(temp);
        }

        arr[0]++;

        System.out.println("printing array for the second time ");

        for(int var : arr){
            System.out.println(var);
        }
    }
}
