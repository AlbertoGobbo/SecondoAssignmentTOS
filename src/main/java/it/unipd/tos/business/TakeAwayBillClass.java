////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClass implements TakeAwayBill{

    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws TakeAwayBillException {
        double total = 0d;
        double countPaniniFritti = 0d;
        int sandwhich = 0;
        int totalOrders = 0;
        double leastExpensive = Double.MAX_VALUE;
        
        if(itemsOrdered.size()>30){
            throw new TakeAwayBillException("Limite massimo raggiunto");
        }
        
        for(MenuItem item : itemsOrdered){
            double price = item.getPrice();
            if(item.getItemtype().equals(ItemType.Panini)){
                sandwhich++;
                countPaniniFritti += item.getPrice();
                if(price < leastExpensive){
                    leastExpensive = price;
                }
                
            }
            
            if(item.getItemtype().equals(ItemType.Fritti)){
                countPaniniFritti += item.getPrice();
            }
            
            total += price;
            
            totalOrders++;
        }
        
        if(sandwhich > 5){
            total -= (leastExpensive / 2);
        }
        
        if(countPaniniFritti > 50){
            total *= 0.9;
        }
        
        if(total > 0 && total < 10){
            total += 0.5;
        }
        
        return total;
    }
    
    

}
