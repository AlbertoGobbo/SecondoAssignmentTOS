////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClass implements TakeAwayBill{
    
    public TakeAwayBillClass() {
        // TODO Auto-generated constructor stub
    }

    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws TakeAwayBillException {
        double total = 0;
        int sandwhich = 0;
        double leastExpensive = Double.MAX_VALUE;
        
        for(MenuItem item : itemsOrdered){
            double price = item.getPrice();
            if(item.getItemtype().equals(ItemType.Panini)){
                sandwhich++;
                
                if(price < leastExpensive){
                    leastExpensive = price;
                }
            }
            
            total += price;
        }
        
        if(sandwhich > 5){
            total -= (leastExpensive / 2);
        }
        
        return total;
    }
    
    

}
