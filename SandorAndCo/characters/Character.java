package roleplayinggame.characters;

/**
 *
 * @author Halász 'Trimere' Gábor & Motyka 'Tuszy' Róbert
 */
public abstract class Character {

    //Változó deklaráció
    private int health;
    private int healthCap;
    private int attackRating;
    private int defenseRating;
    private int strength;
    private int dexterity;
    private int constitution;

   /**
     *Constructor: default super() constructor for character.
	 * This class is the parent class of the enemy and player classes.
     */
    public Character() {
    }

	/**
     * @return Returns the actual healthpoints of the character.
     */
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

	/**
     * @return Returns the maximal amount of the maximum healtpoint of the current level of the character.
     */
    public int getHealthCap() {
        return healthCap;
    }

	/**
     * @param healthCap Sets the maximum health of the player
     */	
    public void setHealthCap(int healthCap) {
        this.healthCap = healthCap;
    }

	/**
	 * 
     * @return Returns of the current value of the field AttackRating.
     */
    public int getAttackRating() {
        return attackRating;
    }

	/**
     * @param attackRating Sets the attack rating of the hero
     */
	
    public void setAttackRating(int attackRating) {
        this.attackRating = attackRating;
    }

	/**
     * @return Returns the defense rating of the character.
     */
    public int getDefenseRating() {
        return defenseRating;
    }
	
	/**
     * @param defenseRating Sets the defense rating of the character.
     */

    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }

	/**
     * @return Returns of the player's actual strength.
     */
    public int getStrength() {
        return strength;
    }
	
	/**
     * @param strength Sets of the player's actual strength.
	 *
     */

    public void setStrength(int strength) {
        this.strength = strength;
    }

	/**
     * @return Returns the current dexterity of the player
     */
    public int getDexterity() {
        return dexterity;
    }
	
	/**
     * @param dexterity Sets the current dexterity of the player
     */

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

	/**
     * @return Returns of the player's stamina value.
     */
    public int getConstitution() {
        return constitution;
    }
	
	/**
     * @param constitution Sets the current stamina of the player
     */

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
}
