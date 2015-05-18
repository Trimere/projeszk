/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author halasz
 */
public class Events {

    public Events() {

    }

    public KeyListener event = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {

            //TODO
        }

        @Override
        public void keyPressed(KeyEvent e) {

            int keyCode = e.getKeyCode();

            switch (keyCode) {

                case KeyEvent.VK_I:
                    System.out.println("I");
                    break;
                case KeyEvent.VK_C:
                    System.out.println("C");
                    break;

                    //TODO
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            //TODO
        }
    };
}
