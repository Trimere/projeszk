package roleplayinggame.characters;

import java.util.Random;

/**
 *
 * @author Halász 'Trimere' Gábor
 */

public class Player extends Character {

    //Változó deklaráció
    private String name;
    private int level;
    private int actual_exp;
    private String role;
    private int levelCapExp = 100;
    Random rnd = new Random();
    
    /**
     * Constructor: creates a player object with default values.
     */
    public Player() {

        name = "Sándor";
        role = "AlphaFighter";
        actual_exp = 0;
        level = 1;
        
        setStrength(rnd.nextInt(3)+1);
        setDexterity(rnd.nextInt(3)+1);
        setConstitution(rnd.nextInt(3)+1);
        
        setHealth(30*getConstitution());
        setHealthCap(getHealth());
        
        setAttackRating(getStrength()*5);
        setDefenseRating(getDexterity()*5);
    }
    
	/**
     * @return Returns of the requriments of the next level's experience points.
     */
    public int getLevelCapExp() {
        return levelCapExp;
    }

	/**
     * @param levelCapExp Sets the the requriments of the next level's experience points.
     */
    public void setLevelCapExp(int levelCapExp) {
        this.levelCapExp = levelCapExp;
    }
	
	/**
     * @return Returns of the player's name.
     */
    public String getName() {
        return name;
    }

	/**
     * @return Returns the current level of player object.
     */
    public int getLevel() {
        return level;
    }

	/**
     * @return Returns the role of the current player.
     */
    public String getRole() {
        return role;
    }

	/**
     * @param level Sets the player's level to the values of the parameter.
     */
    public void setLevel(int level) {
        this.level = level;
    }

	/**
     * @return Returns the actual amount of experience points of player.
     */
    public int getActual_exp() {
        return actual_exp;
    }

	/**
     * @param actual_exp sets the actual amount of experience points of the player.
     */
    public void setActual_exp(int actual_exp) {
        this.actual_exp = actual_exp;
    }

	/**
     * @param name Sets the name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

	/**
     * @param role Sets the role of the player.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    

}
