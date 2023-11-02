package Extras;
import java.util.Random;

public class random {

    static int var;
    public static void main(String[] args) {

        for(int i = 0 ; var != 6 ; i++ ) {
            Random rand = new Random();
            var = rand.nextInt(7);
            System.out.println(var);
        }

        System.out.println("found 6");
    }
}


// if 6 is entered it takes from 0 to 5 (6 is not included )
