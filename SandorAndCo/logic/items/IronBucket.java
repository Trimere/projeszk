package sandorandco.logic.items;

/**
 *
 * @author Robert Motyka
 */
public class ShortSword extends Item implements Armor{
    private final int defMod = 10;
    public final String details = "Not a good protection in combat, but comes in handy for a random ice bucket challange...";
    
    public ShortSword(){
        super("Iron bucket", true, 6, 10);
    }
    
    @Override
    public String getType(){
        return "Head";
    }
}