package sandorandco.logic.items;

/**
 *
 * @author Robert Motyka
 */
public class WoodenStick extends Item implements Weapon{
    private final int attackMod = 5;
    public final String details = "A wooden stick. Part of the starter pack for every newly born hero!";
    
    public WoodenStick(){
        super("Wooden stick", true, 3, 5);
    }
}
