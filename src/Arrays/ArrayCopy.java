package Arrays;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] arr = {2, 5, 12, 57, 46, 58, 97};

        int[] arr2 = new int[10];   // this should not be done while copying as the length will be overrided

        System.out.println("length before: " + arr2.length);
        arr2 = Arrays.copyOf(arr, arr.length);

//        arr2[7] = 2122;

        System.out.println("length after: " + arr2.length);

        for (int trav : arr2) {
            System.out.println(trav);
        }




//        ------------------------------------------Prob solved-----------------------------


        System.out.println("------------------------------------------------------");
        AvoidProb obj = new AvoidProb();
        obj.meth();

    }
}

//so to avoid the Above problem

class AvoidProb{
    public void meth(){
        int[] arr = {2,5,12,57,46,58,97};

        int[] arr2 = Arrays.copyOf(arr,arr.length +1 );

        arr2[7] = 2122;

        for(int trav : arr2){
            System.out.println(trav);
        }
    }
}