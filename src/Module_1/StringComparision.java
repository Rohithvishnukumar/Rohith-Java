package Module_1;

public class StringComparision {

    public static void main(String[] args) {
        
        String var = "Rohith";
        String temp = "Rohith";

        String str = new String("Rohith");

        System.out.println(var == temp);
        System.out.println(var == str);
        System.out.println(var.equals(str));
    }
}

// in string  comparision never use == as this operator will check the references pointing to  memory locations of the two strings but when you create a new string using (new) keyword then it will allocate new memory location 

// So our major agenda of comparing strings is to compare their content
