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
    
    public Inventory(int size){
        this.size = size;
    }
    
    public void addItem(Item i){
        if(items.size() < size){
            items.add(i);
        }
    }
    
    public void removeItem(Item i){
        items.remove(i);
    }
    
    public List getItems(){
        return items;
    }
}