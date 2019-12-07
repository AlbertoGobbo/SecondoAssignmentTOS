////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClass implements TakeAwayBill{
    
    public TakeAwayBillClass() {
        // TODO Auto-generated constructor stub
    }

    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws TakeAwayBillException {
        double total = 0;
        for(MenuItem item : itemsOrdered){
            total += item.getPrice();
        }
        return total;
    }

}
