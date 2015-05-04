/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandorandco.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Molnár Gábor
 */
public class MainView extends JFrame{
    private JPanel mainpanelLeft;
    private JPanel mainpanelMid;
    private JPanel mainpanelRight;
    private JPanel secondLeftTop;
    private JPanel secondLeftbot;
    private JPanel secondRightTop;
    private JPanel secondRightBot;
    private JPanel loggerPanel;
    private JPanel actStatPanel;
    private JPanel statusPanel;
    private JPanel inventoryPanel;
    
    //midapenel elemek
    private TextArea logger;
    private JLabel actStat;
    
    //akciógombok
    private JButton gomb1;
    private JButton gomb2;
    private JButton gomb3;
    
    //képek
    private ImageIcon profilepic;
    private JLabel champProfile;
    
    
    
    public MainView() {
        
        //frame beállítása
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(1024,768));
        //setResizable(false);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
        //MainPanelek beállítása
        mainpanelLeft = new JPanel();
            mainpanelLeft.setLayout(new BoxLayout(mainpanelLeft, BoxLayout.Y_AXIS));
        
        mainpanelMid = new JPanel();
            mainpanelMid.setLayout(new BorderLayout());
        
        mainpanelRight = new JPanel();
            mainpanelRight.setLayout(new BoxLayout(mainpanelRight, BoxLayout.Y_AXIS));
        
        //másodlagos panelek beállítása
        secondLeftTop = new JPanel();
            secondLeftTop.setLayout(new BorderLayout());
     
        secondLeftbot = new JPanel();
            secondLeftbot.setLayout(new BoxLayout(secondLeftbot, BoxLayout.Y_AXIS));

        secondRightTop = new JPanel();
            secondRightTop.setLayout(new BorderLayout());
        
        secondRightBot = new JPanel();
            secondRightBot.setLayout(new BorderLayout());
        
        
        //máodlagos panelek hozzáadása
        

        //bal top/bot
        mainpanelLeft.add(secondLeftTop);
        mainpanelLeft.add(secondLeftbot);
        //jobb top/bot
        mainpanelRight.add(secondRightTop);
        mainpanelRight.add(secondRightBot);
        
        //MID
        //logger
        loggerPanel = new JPanel();
        logger = new TextArea();
        logger.setEditable(false);
        loggerPanel.add(logger);
        
        //actstat (label)
        actStatPanel = new JPanel();
        actStat = new JLabel();
        actStat.setPreferredSize(new Dimension(524,30));
        actStatPanel.add(actStat);
        
        //status panel
        statusPanel = new JPanel();
        
        //inventory panel
        inventoryPanel = new JPanel();
        
        
        //mainpanelMid elemek beállítása
        mainpanelMid.add(loggerPanel, BorderLayout.SOUTH);
        mainpanelMid.add(actStatPanel, BorderLayout.NORTH);
        mainpanelMid.add(statusPanel, BorderLayout.LINE_START);
        mainpanelMid.add(inventoryPanel, BorderLayout.LINE_END);
        
        //left/top/profilepicture
        try{
        BufferedImage bi = ImageIO.read(new File("images/player4.jpg"));
        profilepic = new ImageIcon(bi);
        champProfile = new JLabel(profilepic);
        //JOptionPane.showMessageDialog(null, champProfile);
        //champProfile.setIcon(profilepic);
        secondLeftTop.add(champProfile, BorderLayout.CENTER);
        }catch(IOException i){}
        
        //left/bot/gombok
        //akciógombok hozzáadása
        gomb1 = new JButton();
        gomb2 = new JButton();
        gomb3 = new JButton();
            
        secondLeftbot.add(gomb1);
        secondLeftbot.add(gomb2);
        secondLeftbot.add(gomb3);
        
        
        
        //szinezés segédlet
        mainpanelMid.setBackground(Color.blue);
        secondLeftTop.setBackground(Color.green);
        secondLeftTop.setBackground(Color.gray);
        secondRightTop.setBackground(Color.red);
        secondRightBot.setBackground(Color.yellow);

        
        //mainpanelek hozzáadása
        add(mainpanelLeft); add(mainpanelMid);add(mainpanelRight);
        
        validate();
        repaint();
        //pack();
        
        
    }
    
}
