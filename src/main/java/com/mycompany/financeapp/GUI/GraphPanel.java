/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Joshua
 */
public class GraphPanel extends JPanel{
    private Random rand = new Random();
    private BigDecimal Data [] = new BigDecimal[10];
    private static final long serialVersionUID = 1L;
    
    public GraphPanel(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    }
    
    @Override
    public void paintComponent(Graphics g){
    
        g.drawLine(10, 10, 10, this.getHeight()-10);
        g.drawLine(10, this.getHeight()-10, this.getWidth()-10, this.getHeight()-10);
    
    
    }
    public void SetData(BigDecimal [] data){
    this.data = new data;
    }
}
