package sandorandco.logic.items;

/**
 *
 * @author Robert Motyka
 */
public abstract class Item {
    private final String name;
    private final boolean equippable;
    private final int weight;
    private final int worth;

    Item(String name, boolean equippable, int weight, int worth) {
        this.name = name;
        this.equippable = equippable;
        this.weight = weight;
        this.worth = worth;
    }
    
}
