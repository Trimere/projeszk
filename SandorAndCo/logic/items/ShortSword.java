package sandorandco.logic.items;

/**
 *
 * @author Robert Motyka
 */
public class ShortSword extends Item implements Weapon{
    private final int attackMod = 10;
    public final String details = "A big step for the hero, his first real weapon!(not that the stick wasn't real, but hey...)";
    
    public ShortSword(){
        super("Short sword", true, 7, 15);
    }
}