package bnccsesi3;

public class Player {
    // Variable, huruf kecil 
    // Object, huruf kecil
    // Class, diawalin kapital
    // Function diawalin kapital
    private String name ;
    private String attackSkill = "Haven`t learned any skill";
    private int level;
    private int exp = 0;
    
    // Function ini bakal pelajarin skill yang ada di buku
    void Learn(Books book) {
        System.out.println("Learning " + book.skill);
        this.attackSkill = book.skill;
    }
    
    // Naikin level dari player, syarat naik level itu exp 20;
    void LevelUP() {
       if(this.exp >= 20) {
           System.out.println("Level UP");
           this.exp -= 20;
           this.level++;
       } else {
           System.out.println("Exp is not enough!");
       }
    }
    
    // function ini buat dapet exp
    void Fight(Monsters monster) {
        if(this.level >= monster.level ) {
            System.out.println("You`re fighting a level " + monster.level + " " +  monster.name);
            System.out.println("You earn " + (monster.exp - 10)+ " exp");
            this.exp += (monster.exp - 10);
        } else {
            System.out.println("You`re fighting a level " + monster.level + " " +  monster.name);
            System.out.println("You earn " + monster.exp+ " exp");
            this.exp += monster.exp;
        }      
    }
    
    
    void DisplayInformation() {
        System.out.println("Player name  : " + this.name);
        System.out.println("Player skill : " + this.attackSkill);
        System.out.println("Player level : " + this.level);
    }
    
    // Constructor
    Player(String name, String attackSkill, int level) {
        this.name = name;
        this.attackSkill = attackSkill;
        this.level = level;
    }
    
    Player(String name, int level) {
        this.name = name;
        this.attackSkill = attackSkill;
        this.level = level;
    }
    
    // Setter & Getter
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
    }
    
    int getLevel() {
        return this.level;
    }
}
