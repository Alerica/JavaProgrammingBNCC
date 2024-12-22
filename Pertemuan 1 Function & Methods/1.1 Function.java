package bnccsesi1;

public class BNCCSesi1 {

    public static void main(String[] args) {
        Add(5,7); //  This will display 13
        System.out.println(Product(5,5)); //  This will display 25
    }

    // This is void Function, void function doesn`t return a value
    public static void Add(int a, int b) {
          System.out.println((a+b));
    }

    // Function that return a variable
    public static int Product(int a, int b) {
          return a * b;
    }
    
}
