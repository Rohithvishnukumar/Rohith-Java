package Extras;
public class factorial {

    public static void main(String[] args) {

        long factorial = multiplyNumbers(6);
        System.out.println("Factorial of " + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}

