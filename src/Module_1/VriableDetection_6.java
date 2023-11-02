package Module_1;

import java.util.Scanner;

public class VriableDetection_6 {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        
        System.out.println("Enter the literal");

        if(scr.hasNextInt() == true){
            System.out.println("The entered number is an integer");
        }
       

        else if(scr.hasNextFloat()){
            System.out.println("Entered number is float");
        }

        else if(scr.hasNextLine()){
            System.out.println("The entered number is String");
        }
        
    }
}
