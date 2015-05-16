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

    public Listeners(Frame frame, Model model, Player player) {
        this.view = frame;
        this.model = model;
        this.player = player;
    }
    
    public ActionListener fightActionListener = new ActionListener() {
        @Override
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

        @Override
        public void actionPerformed(ActionEvent ae) {
            model.rest();
            view.textUpdate();
        }

    };

    public ActionListener saveActionListener = new ActionListener() {
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
        @Override
        public void actionPerformed(ActionEvent e) {

            view.dispose();
        }
    };

    public ActionListener helpActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            HelpFrame frame = new HelpFrame();

            frame.setModal(true);
            frame.setVisible(true);
        }
    };

    public ActionListener muteActionListener = new ActionListener() {

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
