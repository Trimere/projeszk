package sandorandco.logic.items;

/**
 *
 * @author Robert Motyka
 */
public class Stick extends Item implements Weapon{
    private final int attackMod = 5;
    public final String details = "A stick. Part of the starter pack for every newly born hero!";
    
    public Stick(){
        super("Stick", true, 3, 5);
    }
}
