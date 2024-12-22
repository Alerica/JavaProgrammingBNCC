package bnccsesi3;

public class BNCCSesi3 {

    public static void main(String[] args) {
        Player player = new Player("Ricky", 1);
        player.DisplayInformation();
        System.out.println("\n\n");
        
        Books fireBook = new Books("fire ball");
        
        player.Learn(fireBook);
        System.out.println("\n\n");
        
        Monsters slime = new Monsters("Slime", 20, 3);
        player.Fight(slime);
        System.out.println("\n\n");
        player.LevelUP();
        
        player.Fight(slime);
        System.out.println("\n\n");
        player.LevelUP();
        
        player.Fight(slime);
        System.out.println("\n\n");
        player.LevelUP();
        
        
        System.out.println("\n\n");
        player.DisplayInformation();
    }

}


//        Students student = new Students("Max", "288892323", 20);
//        System.out.println(student.nama);
//        student.Run();
//        Students.Run();
//        
//        BNCCSesi3 sesi3 = new BNCCSesi3();

//        Students("Ricky", "282391239", 20);
//
//        Students student1 = new Students("Ricky", "2083728347", 20);
//        System.out.println("Nama = " + student1.nama);
//
//
//        Students student2 = new Students("Alex", "2389389839",  20);
//        System.out.println("Nama = " + student2.nama);
//        
//        Students student3 = new Students();
//        System.out.println("Nama = " + student3.nama); 


