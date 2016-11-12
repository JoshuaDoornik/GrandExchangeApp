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
    private static final long serialVersionUID = 1L;
    
    public GraphPanel(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    }
    
    @Override
    public void paintComponent(Graphics g){
        
    
        g.drawLine(10, 10, 10, this.getHeight()-10);
        g.drawLine(10, this.getHeight()-10, this.getWidth()-10, this.getHeight()-10);
        drawData(g);
       
    
    }
  
    private void drawData(Graphics g){
    g.setColor(Color.RED);
   
    int [] data = new int[10];
    
   
    
        for (int i = 0; i < 10; i++) {
            
      
       
       data[i] = rand.nextInt(100);
       
       }
    int upperboundScale = (this.getHeight()-10) / linearSearch(data);
    int sideScale = (this.getWidth()) /data.length; 
   
        for (int i = 1; i < data.length; i++) {
            
            int x1 = sideScale*(i-1)+10;
            int x2 = sideScale*i+10;
            int y1 = data[i-1]*upperboundScale;
            int y2 = data[i]*upperboundScale;
            g.drawLine(x1, y1, x2, y2);
            
            
            System.out.println(x1 + " " + x2 + " " + y1 + " " + y2);
        }
    
    }
        private int linearSearch(int[] toSearch){
        int biggest = 0;
            for (int i = 0; i < toSearch.length; i++) {
                
                if (toSearch[i] > biggest) {
                    biggest = toSearch[i];
                }
            }
            System.out.println(biggest);
        return biggest;
        }
}
