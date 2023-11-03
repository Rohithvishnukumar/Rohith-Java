package Module_1;

import java.util.Scanner;

public class UserInput_4 {
    
    public static void main(String[] args)
     {
        Scanner scr = new Scanner(System.in);
        System.out.print("enter :  ");
        String str = scr.nextLine();
        System.out.print("enter :  ");
        String var = scr.next();
        

        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("r"));

        System.out.println("Next line ------------  " + str);
        System.out.println("Next-------  " + var);
    }
}


// The main difference between next() and nextLine() is next() only takes without spaces if there is a space between a word then it ignores all content after the space 