/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import org.jgraph.JGraph;


/**
 *
 * @author Joshua
 */
public class GraphPanel extends JPanel{
    JGraph graph;
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
   
    int [] data = new int[]{0,1,2,3,4,5,6,7,8,9,10,0,1,2,3,4,5,6,7,8,9,10};
    
    double max = linearSearch(data);
    int sideScale = (this.getWidth()) / data.length; 
   
        for (int i = 1; i < data.length; i++) {
            
            int x1 = sideScale*(i-1)+10;
            int x2 = sideScale*i+10;
            
            double y1 = ((data[i-1] / max)*100)*4.25;
            double y2 = ((data[i] / max)*100)*4.25;
            y1 +=10;
            y2 +=10;
            g.drawLine(x1, (int)y1, x2, (int)y2);
            
            
            System.out.println(y1 + " " + y2);
        }
    
    }
        private int linearSearch(int[] toSearch){
        int biggest = 0;
            for (int i = 0; i < toSearch.length; i++) {
                
                if (toSearch[i] > biggest) {
                    biggest = toSearch[i];
                }
            }
            
        return biggest;
        }
}
