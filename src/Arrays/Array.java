import java.util.Scanner;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

//        Different styles of Array Declarations


        int[] arr = new int[5];
        String[] arr1 = {"Rohith" ,"Vishnu", "Kumar"};
        int[] arr3 = new int[]{2,3,4,5};
        int[] arr4 = IntStream.rangeClosed(0, 9).toArray();

//

        for( int i = 0; i < arr.length ; i++){
            System.out.print("Enter the value of " + (i+1) + " element : ");
            arr[i] = scr.nextInt();
        }

        for( int tra : arr){    // for each loop
            System.out.println(tra);
        }

    }
}


// 1) The size of the Array is fixed (Once declared you cannot change the size)
// 2) For appending of any elements in an array we need to create a new array of length greater than the previous and copy the contents and you can append
