package Module_1;

class IfExample {
    public static void main(String s[]) {
        float fl = 5.3f;
        if (fl == 5.3)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
    }
}

// here 5.3 is double by default which when compared (compiler always converts into binary
// and compares) with floating point are not exactly equal