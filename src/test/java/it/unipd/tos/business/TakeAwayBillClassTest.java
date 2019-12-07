package it.unipd.tos.business;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClassTest {
    
    private TakeAwayBillClass takeAwayBill;
    
    @Before
    public void before(){
        takeAwayBill = new TakeAwayBillClass();
    }

    @Test
    public void testGetOrderPrice() {
        List<MenuItem> ItemOrderedList = new ArrayList<MenuItem>();
        for(int i=0; i<4; i++){
            ItemOrderedList.add(new MenuItem(ItemType.Bevande,"Coca Cola",4d));
        }
        
        try{
            assertEquals(16,takeAwayBill.getOrderPrice(ItemOrderedList),0);
        }catch(TakeAwayBillException exception){
            fail(exception.getMessage());
        }   
    }
    
    @Test
    public void testSaleSandwhich(){
        List<MenuItem> ItemOrderedList = new ArrayList<MenuItem>();
        for(int i=0; i<6; i++){
            ItemOrderedList.add(new MenuItem(ItemType.Panini,"Hot dog", 6d));
        }
        
        try{
            assertEquals(33d,takeAwayBill.getOrderPrice(ItemOrderedList),0);
        }catch(TakeAwayBillException exception){
            fail(exception.getMessage());
        }
        
    }
    
    @Test
    public void testGetSaleSandwhichAndFried(){
        List<MenuItem> ItemOrderedList = new ArrayList<MenuItem>();
        for(int i=0; i<3; i++){
            ItemOrderedList.add(new MenuItem(ItemType.Panini,"Hot dog", 6d));
            ItemOrderedList.add(new MenuItem(ItemType.Fritti,"Frittura mista", 12d));
        }
        
        try{
            assertEquals(48.6d,takeAwayBill.getOrderPrice(ItemOrderedList),0);
        }catch(TakeAwayBillException exception){
            fail(exception.getMessage());
        }
        
    }
    
    @Test(expected = TakeAwayBillException.class)
    public void testSizeOver30() throws TakeAwayBillException{
        List<MenuItem> ItemOrderedList = new ArrayList<MenuItem>();
        for(int i=0; i<32; i++){
            ItemOrderedList.add(new MenuItem(ItemType.Bevande,"Coca Cola",3.5d));
        }
        takeAwayBill.getOrderPrice(ItemOrderedList);
    }

}
