package Module_1;
import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {

        int temp = 90;
        System.out.print("enter: ");
        Scanner scr = new Scanner(System.in);
        int var = scr.nextInt();

        String res = (var > temp) ? "Greater than temp" : "Lesser than temp";

        int ires = (temp < var) ? 222 : 333 ;

        System.out.println(res);
        System.out.println(ires);
    }

}
