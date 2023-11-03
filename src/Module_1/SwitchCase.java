package Module_1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("enter the value: ");
        int var = scr.nextInt();
        int sum = 2;

        switch (var) {
            case 1: {
                System.out.println("MONDAY");
                sum = 90;
                break;
            }

            case 2: {
                System.out.println("Tuesday");
                break;
            }

            case 3: {
                System.out.println("Wednesday");
                break;
            }

            case 4: {
                System.out.println("Thursday");
                break;
            }

            case 5: {
                System.out.println("Friday");
                break;
            }

            case 6: {
                System.out.println("Saturday");
                break;
            }

            case 7: {
                System.out.println("Sunday");
                break;
            }

            default: {
                System.out.println("Enter a valid number to get a week");
                break;
            }
        }

        System.out.println(sum);
    }
}

// you can also write case statements without curly braces also there is no significant diffrences
// You can also place default where ever in switch block but make sure that there is break in the default