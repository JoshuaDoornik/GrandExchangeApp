/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockGrabber;

/**
 *
 * @author Joshua
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class grabLogic {
  
   
    
    
    public Stock getStock(String name){
        Stock stock = null;
    
        try {
            stock = YahooFinance.get(name);
        } catch (IOException ex) {
            Logger.getLogger(grabLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (stock == null) {
            System.out.println("could not grab stock");
        }
        return stock;
    }
            
}
