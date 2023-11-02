package Extras;
import java.util.Random;

class Dsa{
    static int function(int n) {
        int i;
        if (n <= 0) {
            return 0;
        }
        else {
            Random rand = new Random();
            int var = n-1;
            i = rand.nextInt(var);
            System.out.println("this");
            return function(i) + function(n-1-i);
        }
    }

    public static void main(String[] args) {
        Dsa.function(6);
    }
}

