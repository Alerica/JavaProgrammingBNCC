package bnccsesi4;

import java.awt.Color;
import javax.swing.JFrame;

public class BNCCSesi4 {

    public static void main(String[] args) {
         //GUI
         JFrame frame = new JFrame();
         frame.setVisible(true);
         frame.setSize(512, 512);
         frame.setBackground(Color.yellow);
        
    }
    
}

//        // Encapsulation, Polymorph, Inheritance, Abstraction
//        // Encapsulation -> limit access suatu data (public, private, protected)
//        // Polymorph -> override
//        Sapi sapi = new Sapi("Kaka", "26", "Sapi");
//        sapi.CaraBergerak();
//        
//        Ikan koi = new Ikan("Caca", "5", "Koi");
//        koi.CaraBergerak();
//        
//        Hewan hewan = new Hewan("Sasa", "21", "Kucing");
//        hewan.CaraBergerak();
//        
//        VenusGuyTrap venus = new VenusGuyTrap();
//        venus.CaraMakan();

//        
//        Mahasiswa mahasiswa1 = new Mahasiswa("Ricky", "20", "2702224950", "823189821");
//        System.out.println("Nim dari " + mahasiswa1.getNama() + " adalah " + mahasiswa1.getNIM());
//        
//        // Static polymorph - run time
//        mahasiswa1.Belajar();
//        mahasiswa1.Belajar("Algo");


//Hewan sapi = new Hewan("lala", "20");
//        sapi.setKingdom("animalia");
//        sapi.setSpesies("sapi");
//        System.out.println("Nama dari hewan sapi adalah " + sapi.getNama());
//        System.out.println("Umur dari hewan sapi adalah " + sapi.getUmur());
//        System.out.println("Kingdom dari hewan sapi adalah " + sapi.getKingdom());
//        System.out.println("Spesies dari hewan sapi adalah " + sapi.getSpesies());
//        