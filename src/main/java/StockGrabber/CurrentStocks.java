/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockGrabber;

import java.io.IOException;
import java.util.*;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author Joshua
 */
public class CurrentStocks {

    private List<Stock> allStocks = new ArrayList<>();
    
    private CurrentStocks() {
    }
    
    public static CurrentStocks getInstance() {
        return CurrentStocksHolder.INSTANCE;
    }
    
    private static class CurrentStocksHolder {

        private static final CurrentStocks INSTANCE = new CurrentStocks();
        
    }
    public void addStock(String name){
      Stock stock = null;
    
        try {
            stock = YahooFinance.get(name);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        if (stock == null) {
            System.out.println("could not grab stock");
        }
        allStocks.add(stock);
    }
    public Stock getStock(String name){
    
    
        return null;
    }
}
