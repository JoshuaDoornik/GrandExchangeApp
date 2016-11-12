/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financeapp.GUI;




/**
 *
 * @author Joshua
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 10; i++) {
            Gui gui = new Gui();
            Thread.sleep(1000L);
            gui.dispose();
        }
     
    
    }
    
}
