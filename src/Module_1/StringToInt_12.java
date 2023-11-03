package Module_1;

public class StringToInt_12 {
    public static void main(String[] args) {
        
        String str = "99";

        // int var =(int) str;   // this will not even work here so we use parsing

        int var = Integer.parseInt(str);

        System.out.println(var);
        System.out.println(  ((Object)var).getClass() );
    }
}
