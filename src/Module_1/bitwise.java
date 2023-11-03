package Module_1;

class Bit{
    
    public static void main(String[] args) {
        
        int var = 5;
        int temp = 4; 

        int sum = var | temp;

        System.out.println(sum);
    }
}

// 5 ---   1 0 1 
// 4  --   1 0 0
//----------------------
//         1 0  1--------------- 4 