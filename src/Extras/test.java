package Extras;
import java.util.*;
class PyramidNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                System.out.print(" 1 ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print(" 0 ");
            }
            System.out.println();
        }
    }
}