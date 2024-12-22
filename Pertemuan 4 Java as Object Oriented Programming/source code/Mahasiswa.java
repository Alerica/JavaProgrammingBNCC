package bnccsesi4;

public class Mahasiswa {

    private String nama;
    private String umur;
    private String NIM; // NIM gak pernah berubah
    private String noTelp;
    
    public void Belajar() {
        System.out.println(this.getNama() + " Lagi belajar");
    }
    
    public void Belajar(String mataKuliah) {
        System.out.println(this.getNama() + " Lagi belajar " + mataKuliah);
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

    public String getNIM() {
        return NIM;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Mahasiswa(String nama, String umur, String NIM, String noTelp) {
        this.nama = nama;
        this.umur = umur;
        this.NIM = NIM;
        this.noTelp = noTelp;
    }
    

}
