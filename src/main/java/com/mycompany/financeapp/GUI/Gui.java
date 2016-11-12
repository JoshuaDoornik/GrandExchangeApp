/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Joshua
 */
class Gui extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JPanel pan;
    private JButton addStock;
    private JTextField stockField = new JTextField(5);
    private List<String> stocks = new ArrayList<>();
    
    public Gui(){
        
    setVisible(true);
    setSize(new Dimension(500,500));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    
    initComponents();
    
   
    }
    private void initComponents(){
    pan = new Panel();
    stockField.setText("");
    
    
    initButtons();
    
    add(pan);
    pan.add(addStock);
    pan.add(stockField);
    
    
    }
    private void initButtons(){
    addStock = new JButton("add");
    addStock.addActionListener((ActionEvent e) -> {
        
        if (!stockField.getText().equals("")) {
           stocks.add(stockField.getText()); 
        }
        System.out.println(stocks.get(stocks.size()-1));
        stockField.setText("");
        
    });
    
    }
    
}
