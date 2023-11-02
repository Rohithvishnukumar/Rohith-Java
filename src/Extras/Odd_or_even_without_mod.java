package Extras;
import java.util.Scanner;

public class Odd_or_even_without_mod {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = scr.nextInt();
        if( (num & 1) ==0 ){
            System.out.println("even");
        }

        else{
            System.out.println("odd");
        }
    }
}

// The code works by bitwise & operator as it performs the bitwise & operation for two numbers in binary (by comparing individual bits) and checks the last digit (LSB) if it is 0 it is even. As the LSB can determine the odd or even nature of numbers in binart

