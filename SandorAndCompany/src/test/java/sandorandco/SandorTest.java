package sandorandco;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import roleplayinggame.logic.Dice;

/**
 * Unit test for simple App.
 */
public class SandorTest 
    extends TestCase
{

    /**
     * Dice test d20
     */
    public void testDiced20()
    {
        int diceSeed = 20;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDice(diceSeed);
            
            assertTrue(diceSeed - throwValue >= 0);
            assertTrue(throwValue <= diceSeed);
        }
    }
    
    /**
     * Dice test d4
     */
    public void testDiced4()
    {
        int diceSeed = 4;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDice(diceSeed);
            
            assertTrue(diceSeed - throwValue >= 0);
            assertTrue(throwValue <= diceSeed);
        }
    }
    /**
     * Dice test d100
     */
    public void testDiced100()
    {
        int diceSeed = 100;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDice(diceSeed);
            
            assertTrue(diceSeed - throwValue >= 0);
            assertTrue(throwValue <= diceSeed);
        }
    }
    
    /**
     * Dice test 3d20
     */
    public void testDice3d20()
    {
        int diceSeed = 20;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDiceMultiple(diceSeed,3);
            
            assertTrue(3*diceSeed - throwValue >= 0);
            assertTrue(throwValue <= 3*diceSeed);
        }
    }
    
    /**
     * Dice test 6d4
     */
    public void testDice6d4()
    {
        int diceSeed = 4;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDiceMultiple(diceSeed,6);
            
            assertTrue(6*diceSeed - throwValue >= 0);
            assertTrue(throwValue <= 6*diceSeed);
        }
    }
    
    /**
     * Dice test 10d100
     */
    public void testDice10d100()
    {
        int diceSeed = 100;
        for(int i =0; i < 9001; i++){
            int throwValue = (new Dice()).throwDiceMultiple(diceSeed,10);
            
            assertTrue(10*diceSeed - throwValue >= 0);
            assertTrue(throwValue <= 10*diceSeed);
        }
    }
}