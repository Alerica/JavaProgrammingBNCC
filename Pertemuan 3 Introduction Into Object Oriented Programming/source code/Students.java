package bnccsesi3;

public class Students {
    // Class access modifier
    // Public bisa di akses ke seluruh class
    // Private cuma bisa di aksed di class dia sendiri
    public String nama; // nama = Ricky
    public String NIM;
    public int age;
    
    // Constructor
    Students(String nama, String NIM, int age) {
        this.nama = nama;
        this.NIM = NIM;
        this.age = age;
    }
    
    Students() {
        
    }
    
    // Method atau Function
    void Study() {
        System.out.println(nama + " lagi belajar");
    }
    
    static void Run() {
        System.out.println("lagi lari");
    }   
    
    
}
