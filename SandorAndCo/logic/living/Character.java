package sandorandco.logic.living;

import sandorandco.logic.Inventory;

/**
 *
 * @author Robert Motyka
 */
public abstract class Character {
    //base stats
    private String name;
    private int lvl;
    private int str;
    private int dex;
    private int con;
    private double xp;
    
    private int attack;
    private int defense;
    private int maxInvWeight;
    
    private Inventory inventory;
    
    Character(String name){
        this.name = name;
        lvl = 1;
        str = 3;
        dex = 3;
        con = 3;
    }
    
    void createInventory(int size){
        inventory = new Inventory(size);
    }
    
    
}
