package Extras;
public class Two_func_recur {
    static int i = 0;


    public static String func(String str){


        i = i + 1;

        System.out.println(str + "9");

        if(i == 10){
            return "Lets see";
        }

        else{
            return func("rohith") + func("vishnu");
        }
    }

    public static void main(String[] args) {
        func("kumar");
    }
}
