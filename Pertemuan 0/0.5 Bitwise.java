package bnccsesi0;

public class BNCCSesi0 {

    public static void main(String[] args) {
        /*
        & (and), will return true if both arguments are true
        | (or), will return true if atleast one of the arguments are true
        ^ (xor), will return true if only of the arguments are true
        
        */
        int a = 7; // 00000111
        int b = 5; // 00000101
        
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
    }
    
}
/* Program output
a & b : 5
a | b : 7
a ^ b : 2
*/
