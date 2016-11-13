/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;


import java.awt.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Joshua
 */
class TradePanel extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private Random rand = new Random();
    
    public TradePanel() {
    super();
    this.setLayout(new GridLayout());
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    }
    
}
