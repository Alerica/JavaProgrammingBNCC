package bnccsesi0;

public class BNCCSesi0 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");        
        }
        System.out.println("");
        
        int count = 10;
        while (count > 0) {
            System.out.print(count + " ");
            count -= 1;
        }
        System.out.println("");
        
        int x = 20;
        do { // Will do the loop first, then check the condition
            System.out.println(x + " ");
            x += 1;
        } while(x < 10);
        System.out.println("");
    } 
    
}
/* Program output
0 1 2 3 4 5 6 7 8 9 
10 9 8 7 6 5 4 3 2 1 
20 
*/
