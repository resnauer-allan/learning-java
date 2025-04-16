package academy.devdojo.javaoneforall.introducion;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        // cast - brute force
        int age = (int) 1000000000000L;
        long bigNumber = 1000;
        float salaryFloat = 2500;
        double salaryDouble = 5000;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = 22;
        char character = 'a';
        String nome = "Allan";
        System.out.println("The age is " +age+" years old");
        System.out.println("Hello! My name is "+nome);
        System.out.println(ageShort);
    }
}
