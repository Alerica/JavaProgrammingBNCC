package bnccsesi4;
// Abstraction
public abstract class Tumbuhan {
    private String nama;
    private String umur;
    private String spesies;
    
    Tumbuhan() {
        
    }
    
    abstract void CaraMakan();
}

class VenusGuyTrap extends Tumbuhan {

    @Override
    void CaraMakan() {
        System.out.println("Cara makan dari tanaman venus adalah makan serangga " );
    }
    
}
