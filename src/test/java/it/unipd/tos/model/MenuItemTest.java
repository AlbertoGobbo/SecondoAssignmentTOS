////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MenuItemTest {

 private static MenuItem menuItem;
    
    @BeforeClass
    public static void beforeClass(){
        menuItem = new MenuItem(ItemType.Bevande,"Coca Cola",4d);
    }

    @Test
    public void testGetItemType() {
        assertEquals(ItemType.Bevande, menuItem.getItemtype());
    }
    
    @Test
    public void testGetName() {
        assertEquals("Coca Cola", menuItem.getName());
    }
    
    @Test
    public void testGetPrice() {
        assertEquals(4d, menuItem.getPrice(),0);
    }
}
