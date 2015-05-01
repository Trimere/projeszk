package sandorandco.logic;

import java.util.Random;

/**
 *  Simulates the throw(s) of an 'n' sided dice.
 *  @author Robert Motyka
 */
public final class Dice {
    private static Random rnd;
    
    /**
    *   Simulates a throw of one 'n' sided dice
    *   @param n The number of sides the dice simulated dice has.
    */
    public static int throwDice(int n){
        return rnd.nextInt(n) + 1;
    }
    
     /**
    *   Simulates 'm' throws of an 'n' sided dice
    *   @param n The number of sides the dice simulated dice has.
    *   @param m The number of throws.
    */
    public static int throwDiceMultiple(int n, int m){
        int result = 0;
        for(int i = 0; i < m; i++){
            result += rnd.nextInt(n) + 1;
        }
        return result;
    }
}
