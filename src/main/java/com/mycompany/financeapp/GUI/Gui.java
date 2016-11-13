/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Joshua
 */
class Gui extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JTabbedPane tabbedPane = new JTabbedPane();
    
   // private JTextField stockField = new JTextField(5);
  
    
    public Gui(){
    initComponents();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    
    
    

    setVisible(true);
    setSize(500,500);
    
    }
    private void initComponents(){

    tabbedPane.addTab("home", new HomeScreen());
    tabbedPane.addTab("graph", new GraphPanel());
    tabbedPane.add("trading", new TradePanel());
    tabbedPane.setPreferredSize(new Dimension(500, 500));
  
    add(tabbedPane);
    }
    
}
