/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author Joshua
 */
public class HomeScreen extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private Random rand = new Random();
    
    public HomeScreen(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    } 
    
}
