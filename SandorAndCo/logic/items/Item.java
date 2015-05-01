/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandorandco.logic.items;

/**
 *
 * @author t
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
