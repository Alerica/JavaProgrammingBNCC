package bnccsesi4;

public class Hewan {

    public Hewan(String nama, String umur, String spesies) {
        this.nama = nama;
        this.umur = umur;
        this.spesies = spesies;
    }

    private String nama;
    private String umur;
    private String spesies;
    
    void CaraBergerak() {
        System.out.println("Ini belum dibikin");
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }
}

class Sapi extends Hewan {
    
    public Sapi(String nama, String umur, String spesies) {
        super(nama, umur, spesies); 
    }
    
    void CaraBergerak() {
        System.out.println("Sapi itu berjalan");
    }
    
}

class Ikan extends Hewan {  
    public Ikan(String nama, String umur, String spesies) {
        super(nama, umur, spesies);
    }
    
    void CaraBergerak() {
        System.out.println("Ikan itu berenang");
    }
    
    
}


