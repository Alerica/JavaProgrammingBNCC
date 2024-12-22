package bnccsesi2;

import java.util.Scanner;

public class BNCCSesi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int input;
        
        program:
        while(true){
            menu();
            input = scan.nextInt(); scan.nextLine();
            switch(input){
                case 1:
                    beli();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    kupon();
                    break;
                case 4:
                    break program;
                default:
                    System.out.println("Invalid input");
            }
        } 
    }    
    
    public static void kupon(){
        Scanner scan = new Scanner(System.in);
        
        String nama;
        
        do {
            System.out.print("Masukan nama : ");
            nama = scan.nextLine();
        } while(nama.length() < 5 || nama.length() > 30);
        
        String kupon;
        do {
            System.out.println("Kupon teridiri dari 8 huruf");
            System.out.print("Masukan Kupon [Contoh : BHJ7QRJ2]: ");
            kupon = scan.nextLine();
        } while (kupon.length() != 8);
        
        // "BK" -> Menangin buku tulis
        kupon = kupon.toUpperCase();
        if (kupon.contains("BK")) {
            System.out.println("Selamat " + nama + ", kamu menangin buku tulis!");
        } else {
            System.out.println("Kamu kurang beruntung");
        }
    }
    
    public static void register(){
        Scanner scan = new Scanner(System.in);
        String email, nama;
        
        do {
            System.out.print("Masukan email [@gmail.com]: ");
            email = scan.nextLine();
        } while(!email.endsWith("@gmail.com"));
        
        do {
            System.out.print("Masukan nama [beri keterangan Bapak/Ibu di awal]: ");
            nama = scan.nextLine();
        } while(!(nama.startsWith("Bapak") || nama.startsWith("Ibu")));
    }
    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Beli ");
        System.out.println("2.Register ");
        System.out.println("3.Kupon");
        System.out.println("4.Exit ");
        System.out.print("Masukan input : ");
    }
    
    public static void beli(){
        Scanner scan = new Scanner(System.in);
        int input, total = 0;
        
        beli:
        while(true) {
            System.out.println("Menu Makanan");
            System.out.println("1. Nasi Goreng Rp 15.000,00");
            System.out.println("2. Nasi Kuning Rp 10.000,00");
            System.out.println("3. Nasi Padang Rp 13.000,00");
            System.out.println("4. Bakso Rp 15.000,00");
            System.out.println("5. Exit");
            System.out.print("Masukan input : ");
            input = scan.nextInt(); scan.nextLine();
            switch(input) {
                case 1:
                    total += 15000;
                    break;
                case 2:
                    total += 10000;
                    break;
                case 3:
                    total += 13000;
                    break;
                case 4:
                    total += 15000;
                    break;  
                case 5:
                    break beli; 
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println("Total harga " + total);
    }
}
        // continue break 
//        loopLuar:
//        for (int i = 0; i < 3; i++) {
//            
//            loopDalam:
//            for(int j = 0; j < 3; j++) {
//                if(j == 2) break loopLuar;
//                System.out.println("Nilai i dan j adalah " + i + " " + j);
//            }
//            
//            System.out.println("Loop J selesai\n");
//        }

////        System.out.print("Masukan nama: ");
//
//            
//        String text = "Alexander Ricky Budianto";
//        String text2 = text.substring(10,16);
//        System.out.println(text);
//        System.out.println(text2);


//        if(text.endsWith("gmail.com")) {
//            System.out.println("Email valid!");
//        } else {
//            System.out.println("Email tidak valid");
//        }
//        String text;
//        int length;
//        // 5-20
//        do {
//            System.out.print("Masukan Nama: ");
//            text = scan.nextLine();
//            length = text.length();
//        } while (length < 3 || length > 30);
//        
//        System.out.println("Halo " + text);
