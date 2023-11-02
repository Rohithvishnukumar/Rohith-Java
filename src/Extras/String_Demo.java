package Extras;
public class String_Demo {
    public static void main(String[] args){
        String str = "Rohith";
        String str1 = "Rohith";

        System.out.println( str == str1 );
        System.out.println( str.equals(str1));

        String s1 = new String("Rohith");
        String s2 = new String("Rohith");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

// str.equals(str2) is used for comparision of two  strings
