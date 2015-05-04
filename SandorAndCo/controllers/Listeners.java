/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sandorandco.views.MainView;

/**
 *
 * @author halasz
 */
public class Listeners {

    MainView view;

    public Listeners(MainView view) {

        this.view = view;
    }

    public ActionListener gomb1Listener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Gomb1");
        }
    };

    public ActionListener gomb2Listener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Gomb2");
        }
    };

    public ActionListener gomb3Listener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Gomb3");
        }
    };

}
