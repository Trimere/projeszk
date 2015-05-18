package sandorandco.logic.living;

import java.util.HashMap;
import sandorandco.logic.Inventory;

/**
 *
 * @author Robert Motyka
 */
public class Player extends Character{
    private double lvlXPNeeded;
    private final double xpLvlInc = 2.2;
    private final int baseXP = 15;
    private HashMap<String, Inventory> equipped = HashMap<>();
    
    public Player(){
        super("Sandor");
        createInventory(10);
        calcLvlXPNeeded(2);
        initEquippedInv();
        
    }

    private void calcLvlXPNeeded(double nextLvl) {
        lvlXPNeeded = baseXP * Math.pow(nextLvl, xpLvlInc);
    }
    
    private void initEquippedInv(){
        
        equipped.put("Head",null);
        equipped.put("Chest",null);
        equipped.put("Hand",null);
        equipped.put("Feet",null);
    }
    
    public void equipItem(Item i){
        
    }
}