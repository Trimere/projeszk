/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roleplayinggame.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JTextArea;

/**
 *
 * @author Róbert
 */
public class HelpFrame extends JDialog {

    private JTextArea text;
    private boolean closed = false;

    public HelpFrame() {
        setSize(3000, 200);

        setLayout(new FlowLayout());
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        setBounds(dim.width / 2 - 400, dim.height / 2 - 350, 800, 600);

        text = new JTextArea();

        text.setAutoscrolls(true);
        text.setSize(dim);

        text.append("Attributes are calculated as follows(for a newly generated, level 1 character):\n"
                + "\n"
                + "-XP = 0\n"
                + "\n"
                + "-level = 1\n"
                + "\n"
                + "-strength, dexterity, constitution: random number between 1-3\n"
                + "\n"
                + "-health = constitution * 30\n"
                + "\n"
                + "-attack rating = strength * 5\n"
                + "\n"
                + "-defence rating = dexterity * 5\n"
                + "\n"
                + "Additional attributes of enemies (also level 1 calculations):\n"
                + "\n"
                + "-status = 'calm' (enemies get enraged when their health gets below 20% of their full health)\n"
                + "\n"
                + "-amount of xp it's worth = (full health / 2) + attack rating + defence rating\n"
                + "\n"
                + "One round of battle:\n"
                + "\n"
                + "The hero throws with a 20 sided dice. The number + hero attack rating has to be more than the enemy defence rating.\n"
                + "\n"
                + "If the hero throws a 20 (or 18 in case of raging enemy), then the attack is a critical.\n"
                + "\n"
                + "In case of a successful attack, the hero throws with a 6 sided dice, which represents the damage. This is added to the attack rating, and this hets subtracted of the enemies current health.\n"
                + "\n"
                + "In case of a critical attack, the final damage gets doubled.\n"
                + "\n"
                + "If the enemy is not killed by the hero's attack, then it throws the same dices, same logic is here as well, inlcuding the critical attack.\n"
                + "\n"
                + "If the enemy is in an enraged status, it's defence rating is reduced to it's 2/3 of total defence rating, but gets to throw twice with the damage dice.\n"
                + "\n"
                + "If the enemy attack kills the hero, then a level 1 hero is generated.\n"
                + "\n"
                + "Leveling of attributes:\n"
                + "\n"
                + "-health increased by constitution * 8\n"
                + "\n"
                + "-attack rating increased by strength attribute\n"
                + "\n"
                + "-defense rating increased by dexterity attribute\n"
                + "\n"
                + "-every third level, user can decide to increase strength, dexterity, or constitution by 1"
        );

        add(text);
        
        pack();

    }
}
