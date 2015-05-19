package roleplayinggame.characters;

import java.util.Random;

/**
 *
 * @author Halász 'Trimere' Gábor
 */
public class Enemy extends Character {

    //Változó deklaráció
    private String race;
    private int worth;
	private int level;
    private String status;
    private int pictureID;
    private boolean raging;
    Random rnd = new Random();

	 /**
	 * Constructor
     * Creates a new enemy object with random values.
     */
    public Enemy() {
		this.level = 1;
        setStrength(rnd.nextInt(3)+1);
        setDexterity(rnd.nextInt(3)+1);
        setConstitution(rnd.nextInt(3)+1);
        
        setHealth(30*getConstitution());
        setHealthCap(getHealth());
        
        setAttackRating(getStrength()*5);
        setDefenseRating(getDexterity()*5);
        race = "";
        worth = (getHealth()/2) + getAttackRating() + getDefenseRating();
        status = "Calm";
        raging = false;
        pictureID = rnd.nextInt(5);

    }

	 /**
     * Returns with the value of the current enemy in experience point. 
     * @return Amount of xp the enemy is worth
     */	
    public int getWorth() {
        return worth;
    }

	/**
     * Sets the value of the Worth field to the parameter.
     * 
	 * @param worth the value of the enemy in experience.
     */
    public void setWorth(int worth) {
        this.worth = worth;
    }
	
	 /**
     * Returns the current level of the enemy.
     * @return The level of the enemy
     */
	public int getLevel() {
        return level;
    }

	/**
     * Sets the level of the current enemy.
     *
     * @param level Value of the required level.
     */
    public void setLevel(int level) {
        this.level = level;
    }

	 /**
     * Returns of the current status of the enemy.  
     * Values: raging: + critical rating
     * 		   calm: gives no bonuses
     * @return Either 'raging' or 'calm'
     */
    public String getStatus() {
        return status;
    }

	
	 /**
     *Sets the status of the enemy. 
     *
     *@param status: 
	 *			raging: gives bonus critical damage
	 *			calm: gives no bonuses
     */
    public void setStatus(String status) {
        this.status = status;
    }

	 /**
     * Returns the race of the actual enemy. 
     *
     * @return The race of the enemy
     */
    public String getRace() {
        return race;
    }

	/**
     * Sets the race of the actual enemy.
     *
     *@param race The race of the enemy in String
     */
    public void setRace(String race) {
        this.race = race;
    }

	 /**
     * Returns of the picture id of the current enemy. 
     * @return A number to identify the picture of enemy in pic list
     */
    public int getPictureID() {
        return pictureID;
    }

	 /**
     * Sets the ID of the showed image about the current enemy.
     * @param pictureID integer values between 1-5
     */
    public void setPictureID(int pictureID) {
        this.pictureID = pictureID;
    }

	 /**
     * Asks the enemy character about raging status (true/false).
     * @return If enemy is either raging, or calm
     */
    public boolean isRaging() {
        return raging;
    }

	 /**
     * Sets the raging status of the enemy to the value of the parameter.
	 * @param raging true/false
     */
    public void setRaging(boolean raging) {
        this.raging = raging;
    }
}
