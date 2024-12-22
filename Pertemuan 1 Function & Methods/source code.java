package bnccsesi1;

import java.util.Scanner;

public class BNCCSesi1 {

    public static void main(String[] args) {
        
        Scanner epson = new Scanner(System.in); 
        
        while (true) {
            System.out.print("Masukan angka : ");
            int a = epson.nextInt();
            System.out.print("Masukan angka : ");
            int b = epson.nextInt(); epson.nextLine();

            System.out.print("Masukan operasi : ");
            String operation = epson.nextLine();

            if (operation.equals("+")) {
                jumlah(a,b);
            } else if (operation.equals("-")) {
                kurang(a,b);
            } else if (operation.equals("*")) {
                kali(a,b);
            } else if (operation.equals("/")) {
                bagi (a,b);
            } else {
                break;
            }
        }
        
    }
    
    // access modifier static/non static 
    public static void jumlah(int a, int b){
        System.out.println("Jumlah dari " + a + " dan " + b + " : " + (a + b)); 
    }
    
    public static void kurang(int a, int b){
        System.out.println("kurang dari " + a + " dan " + b + " : " + (a - b)); 
    }
    
    public static void kali(int a, int b){
        System.out.println("kali dari " + a + " dan " + b + " : " + (a * b)); 
    }
    
    public static void bagi(int a, int b){
        System.out.println("bagi dari " + a + " dan " + b + " : " + (a / b)); 
    }
        
}

//        int a = 20;
//        int b = 7;
//        int c = (a > b) ? b : a;
////        if (a > b) {
////            c = a;
////        } else {
////            c = b;
////        }
////        int c = Math.max(a,b);
//        System.out.println("Nilai minimum " + c);

//        ArrayList<Integer> angka = new ArrayList<>();
//        //  [10] > [20] > [40] > [50]
//        angka.add(10);
//        angka.add(20);
//        angka.add(40);
//        angka.add(50);
//        angka.removeAll(angka);
//        angka.add(50);
//        System.out.println(angka);
//        
//        int x = 10;
//        int y = 7;
//        
//        System.out.println("Hasil " + (x + y));
//        int[] nilai = new int[5];
//        // 4 
//        nilai[0] = 5;
//        nilai[1] = 7;
//        nilai[2] = 3;
//        nilai[3] = 4;
//        nilai[4] = 6;
//        int index = 4;
//        System.out.println("Array at index " + index + " : " + nilai[index]);
//       

//for (int i = 0; i < 10; i++) {
//            nilai = (int) (1 + Math.floor(Math.random() * 6)); // 1 - 6
//            // 1 2 3 4 5 6
//            System.out.println("Dadu : " + nilai);    
//        }
////        double a = 1 + Math.floor(Math.random() * 10); // 1 - 10
////        System.out.println("Nilai a adalah " + a);
//        for (int i = 1; i < 20; i++) {
//            System.out.println(i);
//        }
