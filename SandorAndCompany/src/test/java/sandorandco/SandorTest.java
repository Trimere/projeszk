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
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int diceSeed = 20;
        int throwValue = Dice.throwDice(20);
        
        assertTrue(diceSeed - throwValue >= 0);
        assertTrue(throwValue <= diceSeed);
    }
}
