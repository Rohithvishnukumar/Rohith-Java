package Module_1;

public class TypeCasting_10 {
    public static void main(String[] args) {
    
        short sh = 9;
        byte by = 2;

        int  ssum = (sh + by) ; // here it will automatically promote it to int 

        int myVar = sh; // it automatically gets promoted to int as it is higher datatype

        long var = 453545;
        long temp = 34;

        int isum = (int) (var + temp) ; // here i converted manually from higher datatype to lower

        byte someVar = (byte) var; // here i have converted long to byte so information will be lost 

        System.out.println(isum);
        System.out.println(someVar);
    }
}
