package sandorandco.logic.living;

/**
 *
 * @author t
 */
public class Player extends Character{
    private double lvlXPNeeded;
    private final double xpLvlInc = 2.2;
    private final int baseXP = 15;
    
    public Player(){
        super("Sandor");
        createInventory(10);
        calcLvlXPNeeded(2);
    }

    private void calcLvlXPNeeded(double nextLvl) {
        lvlXPNeeded = baseXP * Math.pow(nextLvl, xpLvlInc);
    }
}
