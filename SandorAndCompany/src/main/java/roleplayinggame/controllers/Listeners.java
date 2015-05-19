/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roleplayinggame.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import roleplayinggame.characters.Player;
import roleplayinggame.gui.CreateFrame;
import roleplayinggame.gui.Frame;
import roleplayinggame.gui.HelpFrame;
import roleplayinggame.gui.LoadFrame;
import roleplayinggame.logic.Model;

/**
 *
 * @author Gab
 */
public class Listeners {

    Frame view;
    Player player;
    Model model;

	/**
	* Contructor: Creates the event handler object.
	* @param frame: visualizes the GUI
	* @param model: main handler class
	* @param player: the user's character
	**/
    public Listeners(Frame frame, Model model, Player player) {
        this.view = frame;
        this.model = model;
        this.player = player;
    }
    
	
	/**
	* ActionListener: This listener responds for event handling of fighting,
	*				  and leveling.
	**/
    public ActionListener fightActionListener = new ActionListener() {
        @Override
		
	/**
	* @param e: The parameter determines the fight action and distributes the characters's attributions.
	**/
        public void actionPerformed(ActionEvent e) {
            int tempInt = player.getLevel();
            model.getFight().simulateFight();
            if (tempInt != player.getLevel() && player.getLevel() % 3 == 0) {
                String[] upgrd = {"Strength", "Dexterity", "Constitution"};
                String tempStr = (String) JOptionPane.showInputDialog(null, "What do you want to upgrade?", "Upgrade box", JOptionPane.QUESTION_MESSAGE, null, upgrd, null);
                switch (tempStr) {
                    case "Strength":
                        player.setStrength(player.getStrength() + 1);
                        break;
                    case "Dexterity":
                        player.setDexterity(player.getDexterity() + 1);
                        break;
                    case "Constitution":
                        player.setConstitution(player.getConstitution() + 1);
                        break;
                }
            }

            view.textUpdate();
            if (model.getFight().isEnemyDead()) {
                model.getFight().createEnemy();
                view.textUpdate();
            }
        }
    };


    public ActionListener restActionListener = new ActionListener() {

		/**
		* The restActionListener begins the resting method of the player.
		* @param ae: It is an interaction from the user. (default action mouse click).
		**/
        @Override
        public void actionPerformed(ActionEvent ae) {
            model.rest();
            view.textUpdate();
        }

    };

    public ActionListener saveActionListener = new ActionListener() {
		
		/**
		* If the user would. He can saves the actual standings of the game in to a file.
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
        @Override
        public void actionPerformed(ActionEvent e) {
            model.savePlayer();
            if (view.getCbModel().getIndexOf(player.getName()) == -1) {
                view.getCbModel().addElement(player.getName());
            }
            System.out.println("Hero has been saved");
        }
    };

    public ActionListener loadActionListener = new ActionListener() {
        
		/**
		* If the user would, he can loads a previous game's standing from file.
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
		@Override
        public void actionPerformed(ActionEvent e) {

            LoadFrame frame = new LoadFrame();

            frame.setModal(true);
            frame.setVisible(true);

            if (!frame.isCanceled()) {

                model.setLoadFileName((String) frame.getHero());
                model.loadPlayer();
                System.out.println("Hero has been loaded");
                model.getFight().createEnemy();
                view.textUpdate();
            }
        }
    };

    public ActionListener createActionListener = new ActionListener() {
        
		/**
		* Creates a new user interface
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
		@Override
        public void actionPerformed(ActionEvent e) {

            CreateFrame frame = new CreateFrame();

            frame.setModal(true);
            frame.setVisible(true);

            if (!frame.isCanceled()) {

                player.setName(frame.getName());
                player.setRole((String) frame.getRole());
                model.createHero();
                view.textUpdate();

            }
        }
    };

    public ActionListener exitActionListener = new ActionListener() {
        
		/**
		* Ends the program.
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
		@Override
        public void actionPerformed(ActionEvent e) {

            view.dispose();
        }
    };

    public ActionListener helpActionListener = new ActionListener() {
        /**
		* Gives description to the user.
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
		@Override
        public void actionPerformed(ActionEvent e) {

            HelpFrame frame = new HelpFrame();

            frame.setModal(true);
            frame.setVisible(true);
        }
    };

    public ActionListener muteActionListener = new ActionListener() {
		/**
		* Mutes the background music of the game.
		* @param e: It is an interaction from the user. (default action mouse click).
		**/
        @Override
        public void actionPerformed(ActionEvent ae) {

            if (view.isIsMute()) {
                view.getClip().start();
                view.setIsMute(false);

            } else {
                view.getClip().stop();
                view.setIsMute(true);
            }
        }

    };

}
