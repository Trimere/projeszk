package roleplayinggame.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import roleplayinggame.characters.Enemy;
import roleplayinggame.characters.Player;
import roleplayinggame.gui.Frame;

/**
 *
 * @author Halász 'Trimere' Gábor
 */
public class Model {

    //Változó deklaráció
    private Player player;
    private Enemy enemy;
    private Dice rnd;
    private String loadFileName;
    public String[] createHero;
    private Fight fight;
    File file;
    File loadFile;

/**
 * Constructor that creates the Model, and initialize the fields of the object.
 * @param frame that visualize the gui.
 *
 */
	
    //konstruktor, ezt már lehet h kell tudni
    public Model(Frame frame) {
        player = new Player();
        enemy = new Enemy();
        rnd = new Dice();
        createHero = new String[2];
        fight = new Fight(player, enemy, this, frame);
    }

/**
 * Returns with the fight field. The fight simulates the battle between the player and an enemy.
 * @return A fight object used to simulate a fight
 */
	
    public Fight getFight() {
        return fight;
    }
	
/**
 * Returns with the fight Player.
 * @return The player instance
 */
    public Player getPlayer() {
        return player;
    }

	
/**
 * Set the player field to the values of the parameter
 *
 * @param player The player is the main caracter of the user.
 */
    public void setPlayer(Player player) {
        this.player = player;
    }

/**
 * Returns with an enemy object.
 * @return Enemy instance
 */
    public Enemy getEnemy() {
        return enemy;
    }

/**
 * Returns with the required filename of the loaded game.
 * @return Name of file to be loaded
 */
    public String getLoadFileName() {
        return loadFileName;
    }

/**
 * Set the filename of the loaded project.
 *
 * @param loadFileName this is the name of the file.
 */	
    public void setLoadFileName(String loadFileName) {
        this.loadFileName = loadFileName;
    }

/**
 * Refill the health argument of the player in rounds.
 * Measurement of refill is 20 healthpoint/round.
 */
    // hp töltő pihenés függvény, 20-asával tölti a hp-t
    public void rest() {

        player.setHealth(player.getHealth() + 20);

        if (player.getHealth() >= player.getHealthCap()) {

            player.setHealth(player.getHealthCap());
        }

    }

/**
 * Saves the actual standings of the actual character into "charactername".tuszione file.
 * 
 */
    public void savePlayer() {

        file = new File("save/" + player.getName() + ".tuszione");

        PrintStream writer = null;

        try {
            
            
            writer = new PrintStream(file);
            writer.println(player.getName());
            writer.println(player.getRole());
            writer.println(String.valueOf(player.getHealth()));
            writer.println(String.valueOf(player.getActual_exp()));
            writer.println(String.valueOf(player.getLevel()));
            writer.println(String.valueOf(player.getAttackRating()));
            writer.println(String.valueOf(player.getDefenseRating()));
            writer.println(String.valueOf(player.getStrength()));
            writer.println(String.valueOf(player.getDexterity()));
            writer.println(String.valueOf(player.getConstitution()));
            writer.println(String.valueOf(player.getHealthCap()));

            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: unable to read file " + file);
            e.printStackTrace();
        }
        if (writer != null) {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }

    }

/**
 * Load the selected characters saved standing to continue the abandoned game.
 *
 */	
	
    public void loadPlayer() {

        System.out.println(loadFileName);

        loadFile = new File("save/" + loadFileName + ".tuszione");

        Scanner scanner;

        try {
            scanner = new Scanner(loadFile);

            player.setName(scanner.next());
            player.setRole(scanner.next());
            player.setHealth(scanner.nextInt());
            player.setActual_exp(scanner.nextInt());
            player.setLevel(scanner.nextInt());
            player.setAttackRating(scanner.nextInt());
            player.setDefenseRating(scanner.nextInt());
            player.setStrength(scanner.nextInt());
            player.setDexterity(scanner.nextInt());
            player.setConstitution(scanner.nextInt());
            player.setHealthCap(scanner.nextInt());

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("ERROR: unable to read file " + loadFile);
            e.printStackTrace();

        }

        
        player.setLevelCapExp(150 + (player.getLevel() - 1) * 120);
    }

/**
 * Create a new character with random values between 1-3.
 *
 */		
	
    public void createHero() {

        player.setName(player.getName());
        player.setRole(player.getRole());
        player.setActual_exp(0);
        player.setLevel(1);
        player.setStrength(rnd.throwDice(3) + 1);
        player.setDexterity(rnd.throwDice(3) + 1);
        player.setConstitution(rnd.throwDice(3) + 1);

        player.setHealth(30 * player.getConstitution());
        player.setHealthCap(player.getHealth());

        player.setAttackRating(player.getStrength() * 5);
        player.setDefenseRating(player.getDexterity() * 5);
    }
}
