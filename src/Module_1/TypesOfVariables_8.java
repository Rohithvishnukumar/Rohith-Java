package Module_1;

public class TypesOfVariables_8 {
    
    public int var = 90;   // instance variable bound to object 

    public static int temp = 23;    // static variable bound to class

    public void meth(){
        
        int arc = 34;   // this is local variable where you cannot access outside the method and you cannot use public modifier also here 
    }
    
}

class Main{
    public static void main(String[] args) {
        
        TypesOfVariables_8 obj1 = new TypesOfVariables_8();

        System.out.println(obj1.var);
        obj1.var = 33;
        System.out.println(obj1.var);

        TypesOfVariables_8 obj2 = new TypesOfVariables_8();

        System.out.println(obj2.var);    // if you see here I have changed the value of var in the above code but that is only changed to obj1 but not obj2 as instance variable is bound to object

        System.out.println();

        System.out.println(obj1.temp);

        obj1.temp = 11;

        System.out.println(obj1.temp);
        System.out.println(obj2.temp);

        // here the temp is bound to class
        

    }
}
