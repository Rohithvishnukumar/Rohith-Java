package HackerRank;

import java.io.*;
import java.util.*;

class AgeException extends Exception {

    public String toString(){
        return "Error occurred due to invalid date";
    }

    public AgeException(){

        System.out.println("Error occurred due to invalid date");

        try {
            Book.input();
        }
        catch (AgeException ae){
            System.out.println(ae.toString());
        }
    }
}

class Book {



    public static String title;
    public static String author;
    public static int pubyear;
    public static int bookCount = 0;

    public Book(String title, String author, int pubyear) {
        this.title = title;
        this.author = author;
        this.pubyear = pubyear;
        bookCount++;
        display();
    }

    public static void input() throws AgeException{

        Scanner scr = new Scanner(System.in);

//        System.out.print("Enter Book title: ");
//        String ti = scr.nextLine();

//        System.out.print("Enter Book author name: ");
//        String au = scr.nextLine();

//        System.out.print("Enter Book Publishing year: ");
//        int pub = scr.nextInt();

        String ti = "1984";
        String au = "George Orwell";
        int pub = 1949;


        if( pub < 0 ){
            throw new AgeException();
        }
        else {
            Book obj = new Book(ti ,au,pub);
        }
    }

    public void display() {
        System.out.printf("Book added: %s by %s (%d). Total books: %d", title, author, pubyear, bookCount);
    }
}

public class Day1 {

    public static void main(String[] args) {


        try {
            Book.input();
        }

        catch(AgeException ae ){
            System.out.println(ae.toString());
        }

        catch (Exception e){
            System.out.println("Exception");
        }

    }

}