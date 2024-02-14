package HackerRank;

import java.io.*;
import java.util.*;

class Product{

    String name;
    String price;
    int quantity;
    static int total = 0;


    public Product(String name,
                   String price,
                   int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        total++ ;
        display();

    }


    public void display(){

        System.out.printf("Product added: %s (%s) - Quantity: %d. Total products: %d", name, price, quantity, total);
    }


}
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        String n = "Laptop";
        String p = "$800" ;
        int q = 15;


        Product obj = new Product(n,p,q);
    }
}