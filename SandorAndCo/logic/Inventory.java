package sandorandco.logic;

import java.util.List;
import sandorandco.logic.items.Item;

/**
 *
 * @author Robert Motyka
 */
public class Inventory {
    private List<Item> items;
    private int size;
    
	 /**
     * Constructor :
     * Creates an inventori list to the player.
     * @param size: integer value of the required size
     */
    public Inventory(int size){
        this.size = size;
    }
    
	 /** 
     * Add items to the inverntory list.
     * @param i The item object that want to add to the list.
     */
    public void addItem(Item i){
        if(items.size() < size){
            items.add(i);
        }
    }
    
	 /**
     * Removes the item object from the inventory list of the player object.
     * @param i The item that want to remove from inventory.
     */
    public void removeItem(Item i){
        items.remove(i);
    }
    
	
	/**
     * Return with the full list of items in the inventory.
     * @return 
     */
    public List getItems(){
        return items;
    }
}