/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import StockGrabber.CurrentStocks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

/**
 *
 * @author Joshua
 */
public class HomeScreen extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private Random rand = new Random();
    private JButton button = new JButton("voeg een stock toe");
    private JTextField text = new JTextField(3);
    private CurrentStocks stocks = CurrentStocks.getInstance();
    
    public HomeScreen(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    initComponents();
    }
    
    public void initComponents(){
    text.setText("");
    button.addActionListener((ActionEvent e) -> {
    String stockname = null;
    
        if (text.getText() != "") {
            stocks.addStock(text.getText());
            stockname = stocks.getStock(text.getText()).getName();
        }
        if (stockname != null) {
            System.out.println(stockname);
        }
        
        
    
    });
    
    add(button);
    add(text);
    
    
    
    }
    
}
