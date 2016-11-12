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
    private BigDecimal nums [];
    private final int GRAPHHEIGHT;
    private final int GRAPHWIDTH;
    private static final long serialVersionUID = 1L;
    
    public GraphPanel(){
    super();
    this.setBackground(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    GRAPHHEIGHT = this.getHeight()-10;
    GRAPHWIDTH = this.getWidth()-10;
    }
    
    @Override
    public void paintComponent(Graphics g){
    
    
        g.drawLine(10, 10, 10, this.getHeight()-10);
        g.drawLine(10, this.getHeight()-10, this.getWidth()-10, this.getHeight()-10);
        drawData(g);
       
    
    }
    public void SetData(BigDecimal [] data){
    this.nums = data;
    }
    private void drawData(Graphics g){
    g.setColor(Color.RED);
     int [] testArrayX = new int[10];
    int [] testArrayY = new int[10];
    
   
    
        for (int i = 0; i < 10; i++) {
            
      
       testArrayX[i] = rand.nextInt(100);
       testArrayY[i] = rand.nextInt(100);
            
       }
    int upperboundScale = (this.getHeight()-10) / linearSearch(testArrayY);
    int sideboundScale = (this.getWidth()-10) / linearSearch(testArrayX);
   
        System.out.println(sideboundScale + ":" + upperboundScale);
        for (int i = 1; i < testArrayX.length; i++) {
            
            int x1 = testArrayX[i-1]*sideboundScale;
            int x2 = testArrayX[i]*sideboundScale;
            int y1 = testArrayY[i-1]*upperboundScale;
            int y2 = testArrayX[i]*upperboundScale;
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
