////////////////////////////////////////////////////////////////////
// [ALBERTO] [GOBBO] [1170556]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TakeAwayBillExceptionTest {

    private static TakeAwayBillException takeAwayBill;
    
    @BeforeClass
    public static void beforeClass(){
        takeAwayBill = new TakeAwayBillException("Exception");
    }
    
    @Test
    public void testGetItemType() {
            assertEquals("Exception",takeAwayBill.getMessagge());
    }

}
