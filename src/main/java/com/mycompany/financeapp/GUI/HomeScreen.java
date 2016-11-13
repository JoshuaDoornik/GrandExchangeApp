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
    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList<String> list = new JList<>(model);
    private int i;
    
    public HomeScreen(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    initComponents();
    initButtons();
    }
    
    private void initButtons(){
    
    
    button.addActionListener((ActionEvent e) -> {
    String stockname = null;
    
        if (text.getText() != "") {
            stocks.addStock(text.getText());
            stockname = stocks.getStock(text.getText()).getName();
            text.setText("");
        }
        if (stockname != null) {
            System.out.println(stockname);
           model.add(i++, stockname);
        }
        

    });
    
    
    
    
    
    }

    private void initComponents() {
     text.setText("");
     add(button);
     add(text);
     add(list);
    }
    
}
