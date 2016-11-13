/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Joshua
 */
class Gui extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JPanel pan;
    private final JTextField stockField = new JTextField(5);
  
    
    public Gui(){
    setVisible(true);
    setSize(new Dimension(500,500));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    
    
    initComponents();
    
   
    }
    private void initComponents(){
    pan = new JPanel();
    tabbedPane.addTab("home", new HomeScreen());
    tabbedPane.addTab("graph", new GraphPanel());
    tabbedPane.add("trading", new TradePanel());
    add(tabbedPane);
    pan.setBackground(new Color(5,3,1));
   
    
    
    }
    
}
